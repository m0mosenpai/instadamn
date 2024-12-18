package X;

import java.util.logging.Logger;

/* renamed from: X.1Kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25051Kj {
    public final String A00;
    public volatile Logger A01;

    public final Logger A00() {
        Logger logger;
        Logger logger2 = this.A01;
        if (logger2 == null) {
            synchronized (this) {
                logger = this.A01;
                if (logger == null) {
                    logger = Logger.getLogger(this.A00);
                    this.A01 = logger;
                }
            }
            return logger;
        }
        return logger2;
    }

    public C25051Kj(Class ownerOfLogger) {
        this.A00 = ownerOfLogger.getName();
    }
}
