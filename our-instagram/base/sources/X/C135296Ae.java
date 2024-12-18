package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135296Ae extends C2WC implements InterfaceC50822Vd {
    public static final InterfaceC77833eB A0C = new InterfaceC77833eB() { // from class: X.6Af
        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC68323VMj.A00(this);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            View view = (View) obj;
            C135296Ae c135296Ae = (C135296Ae) obj2;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(c135296Ae, 2);
            view.setBackground(c135296Ae.A03);
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C135296Ae c135296Ae = (C135296Ae) obj;
            C135296Ae c135296Ae2 = (C135296Ae) obj2;
            C14360o3.A0B(c135296Ae, 0);
            C14360o3.A0B(c135296Ae2, 1);
            Drawable drawable = c135296Ae.A03;
            Drawable drawable2 = c135296Ae2.A03;
            if (drawable == null) {
                if (drawable2 != null) {
                    return true;
                }
                return false;
            }
            if (!drawable.equals(drawable2)) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            View view = (View) obj;
            C14360o3.A0B(view, 1);
            view.setBackground(null);
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }
    };
    public static final InterfaceC77833eB A0D = new InterfaceC77833eB() { // from class: X.6Ag
        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC68323VMj.A00(this);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            View view = (View) obj;
            C135296Ae c135296Ae = (C135296Ae) obj2;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(c135296Ae, 2);
            view.setForeground(c135296Ae.A04);
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C135296Ae c135296Ae = (C135296Ae) obj;
            C135296Ae c135296Ae2 = (C135296Ae) obj2;
            C14360o3.A0B(c135296Ae, 0);
            C14360o3.A0B(c135296Ae2, 1);
            Drawable drawable = c135296Ae.A04;
            Drawable drawable2 = c135296Ae2.A04;
            if (drawable == null) {
                if (drawable2 != null) {
                    return true;
                }
                return false;
            }
            if (drawable2 != null && !drawable.equals(drawable2)) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            View view = (View) obj;
            C14360o3.A0B(view, 1);
            view.setForeground(null);
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }
    };
    public static final InterfaceC77833eB A0E = new InterfaceC77833eB() { // from class: X.6Ah
        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC68323VMj.A00(this);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            View view = (View) obj;
            C135296Ae c135296Ae = (C135296Ae) obj2;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(c135296Ae, 2);
            view.setLayerType(c135296Ae.A01, null);
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C135296Ae c135296Ae = (C135296Ae) obj;
            C135296Ae c135296Ae2 = (C135296Ae) obj2;
            C14360o3.A0B(c135296Ae, 0);
            C14360o3.A0B(c135296Ae2, 1);
            if (c135296Ae.A01 == c135296Ae2.A01) {
                return false;
            }
            return true;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            View view = (View) obj;
            C14360o3.A0B(view, 1);
            view.setLayerType(0, null);
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }
    };
    public static final InterfaceC77833eB A0F = new InterfaceC77833eB() { // from class: X.6Ai
        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC68323VMj.A00(this);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            View view = (View) obj;
            C135296Ae c135296Ae = (C135296Ae) obj2;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(c135296Ae, 2);
            View.OnClickListener onClickListener = c135296Ae.A05;
            if (onClickListener != null) {
                C0fQ.A00(onClickListener, view);
            }
            view.setOnFocusChangeListener(null);
            view.setFocusable(c135296Ae.A09);
            view.setFocusableInTouchMode(false);
            view.setEnabled(c135296Ae.A08);
            if (c135296Ae.A00 != -1) {
                view.setClickable(false);
            }
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            View view = (View) obj;
            C14360o3.A0B(view, 1);
            view.setOnClickListener(null);
            view.setClickable(false);
            view.setOnFocusChangeListener(null);
            view.setFocusable(false);
            view.setFocusableInTouchMode(false);
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            return true;
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public C102884kP A06;
    public C135346Aj A07;
    public boolean A08;
    public boolean A09;
    public final long A0A;
    public final C6FG A0B;

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, java.lang.Object, X.5nq, X.5wz] */
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 1);
        ?? c126555nq = new C126555nq(context);
        c126555nq.A00 = new C131645x0(c126555nq);
        return c126555nq;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.6Aj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.3eB, java.lang.Object] */
    public C135296Ae(C6FG c6fg, long j, boolean z) {
        super(C05F.A01);
        this.A0A = j;
        this.A00 = -1;
        this.A08 = true;
        C77843eC[] c77843eCArr = {AbstractC78283eu.A00(A0C, this), AbstractC78283eu.A00(A0D, this), AbstractC78283eu.A00(A0F, this), AbstractC78283eu.A00(A0E, this)};
        int i = 0;
        do {
            A0D(c77843eCArr[i]);
            i++;
        } while (i < 4);
        this.A02 = 0;
        this.A07 = new Object();
        this.A0B = c6fg;
        C77843eC[] c77843eCArr2 = {AbstractC78283eu.A00(new AbstractC135366Al(this.A0A), this), AbstractC78283eu.A00(new Object(), this)};
        int i2 = 0;
        do {
            A0D(c77843eCArr2[i2]);
            i2++;
        } while (i2 < 2);
        if (!z) {
            A0D(AbstractC78283eu.A00(new InterfaceC77833eB() { // from class: X.6VD
                @Override // X.InterfaceC77833eB
                public final /* synthetic */ String getDescription() {
                    return AbstractC68323VMj.A00(this);
                }

                @Override // X.InterfaceC77833eB
                public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
                    ((ViewGroup) obj).setClipChildren(false);
                    return null;
                }

                @Override // X.InterfaceC77833eB
                public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
                    ((ViewGroup) obj).setClipChildren(true);
                }

                @Override // X.InterfaceC77833eB
                public final /* synthetic */ Class CBk() {
                    return getClass();
                }

                @Override // X.InterfaceC77833eB
                public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
                    return false;
                }
            }, this));
        }
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A0A;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ int E4c() {
        return 3;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ Object BeR() {
        return getClass();
    }
}
