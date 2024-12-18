package X;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: X.6nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149406nr {
    public AbstractC149416ns A00;
    public boolean A01;
    public final C149476ny A02;
    public final C149426nt A03;
    public final C141876b5 A04;
    public final C149396nq A05;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6b5] */
    public C149406nr(Context context, C149396nq c149396nq) {
        this.A05 = c149396nq;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ?? obj = new Object();
        obj.A00 = 90.0f;
        obj.A01 = scaledTouchSlop;
        this.A04 = obj;
        this.A00 = new AbstractC149416ns(obj, c149396nq);
        this.A03 = new C149426nt(context, c149396nq);
        this.A02 = new C149476ny(context, c149396nq);
    }
}
