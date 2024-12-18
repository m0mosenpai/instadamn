package com.facebook.common.dextricks.coverage.logger;

import X.AbstractC02650Ap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class ClassCoverageLogger {
    public static final Queue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A02 = "true".equals(AbstractC02650Ap.A03("fb.enable_class_coverage"));
    public static volatile String A01 = AbstractC02650Ap.A03("fb.throw_on_class_load");
}
