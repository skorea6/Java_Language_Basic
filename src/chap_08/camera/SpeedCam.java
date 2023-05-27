package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    @Override
    public void showMainFeature() {
        System.out.println("속드 측정, 번호 인식");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }
}
