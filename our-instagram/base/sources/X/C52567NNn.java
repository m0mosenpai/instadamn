package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.NNn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52567NNn extends N66 {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionWithBaseFragment";
    public View A00;
    public ScrollView A01;
    public C3I9 A02;
    public final InterfaceC60152ox A03 = new C56177Owk(this, 10);
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_custom_question_fragment";
    }

    public C52567NNn() {
        C57552PgQ A01 = C57552PgQ.A01(this, 2);
        InterfaceC09390do A00 = C57552PgQ.A00(C57544PgI.A01(this, 49), EnumC09460dv.A02, 0);
        this.A04 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 1), A01, C57534Pg8.A00(A00, null, 34), AbstractC25225BEi.A1D(C52596NOr.class));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(63584055);
        super.onDestroy();
        C3I9 c3i9 = this.A02;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(226435499, A02);
    }

    @Override // X.N66, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(837680655);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C3I9 c3i9 = this.A02;
        if (c3i9 != null) {
            c3i9.EFx(this.A03);
        }
        C0f9.A09(1803010341, A02);
    }

    @Override // X.N66, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1589748918);
        super.onStart();
        C3I9 c3i9 = this.A02;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(1825315785, A02);
    }

    @Override // X.N66, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1346289967);
        super.onStop();
        C3I9 c3i9 = this.A02;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(-1227971251, A02);
    }
}
