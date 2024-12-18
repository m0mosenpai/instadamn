package X;

/* renamed from: X.1Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23981Fj extends Thread {
    @Override // java.lang.Thread
    public final synchronized void start() {
        int i = 0;
        while (true) {
            try {
                super.start();
            } catch (OutOfMemoryError e) {
                if (!isAlive()) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    if (!message.startsWith("pthread_create") || !message.endsWith("failed: Try again")) {
                        break;
                    }
                    if (i < 3) {
                        if (i > 0) {
                            try {
                                Thread.sleep(i * 500);
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        i++;
                    } else {
                        OutOfMemoryError outOfMemoryError = new OutOfMemoryError(AnonymousClass001.A0b(e.getMessage(), " JavaThreads:", Thread.activeCount()));
                        outOfMemoryError.initCause(e);
                        throw outOfMemoryError;
                    }
                } else {
                    break;
                }
                throw e;
            }
        }
        throw e;
    }
}
