import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class TestListener implements ITestListener {
    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

        printTestComment(result);
    }

    public void onTestFailure(ITestResult result) {

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }

    private void printTestComment(ITestResult result){
        Method method = result.getMethod().getConstructorOrMethod().getMethod();
        TestComment testCommentAnnotation = method.getAnnotation(TestComment.class);
        System.out.println("ANNOTATION: " + testCommentAnnotation);
        System.out.println("Comment Text: " + testCommentAnnotation.commentText());
        System.out.println("Comment Author: " + testCommentAnnotation.commentAuthor());
    }
}
