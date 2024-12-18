package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6W7, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6W7 extends C2WC implements InterfaceC50822Vd {
    public static InterfaceC77833eB A01 = new InterfaceC77833eB() { // from class: X.6BH
        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC68323VMj.A00(this);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            RCTextView rCTextView = (RCTextView) obj;
            if (obj3 != null) {
                rCTextView.A05((C6BM) obj3);
                return null;
            }
            throw new RuntimeException("Missing text layout context!");
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            ((RCTextView) obj).A04();
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
    public long A00;

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    public C6W7(long j) {
        super(C05F.A01);
        this.A00 = j;
        A0D(AbstractC78283eu.A00(A01, this));
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A00;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        if (this instanceof C131715x7) {
            C14360o3.A0B(context, 0);
            return new RCTextView(context);
        }
        return new RCTextView(context);
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
