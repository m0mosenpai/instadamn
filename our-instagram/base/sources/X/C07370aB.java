package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07370aB implements InterfaceC06670Xe {
    public final C11I A05;
    public final String A06;
    public final List A07 = new ArrayList();
    public boolean A03 = false;
    public int A00 = 9000;
    public boolean A04 = false;
    public java.util.Set A01 = null;
    public boolean A02 = false;
    public final ReadWriteLock A08 = new ReentrantReadWriteLock(true);

    public C07370aB(C11I c11i) {
        this.A05 = c11i;
        String str = C0JA.A00().A01;
        this.A06 = str == null ? "unknown" : str;
    }
}
