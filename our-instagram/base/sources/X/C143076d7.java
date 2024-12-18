package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.6d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143076d7 extends AbstractC150996r0 {
    public static final ThreadFactoryC142916cr A01 = new ThreadFactoryC142916cr("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory A00 = A01;
}
