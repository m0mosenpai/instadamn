package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes6.dex */
public final class EIL extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ThreadDetailsCustomGroupNameAndImageFragment";
    public L7D A00;
    public final InterfaceC09390do A03;
    public final FPE A01 = new FPE(this);
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = __redex_internal_original_name;

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        C14360o3.A0B(layoutInflater, 0);
        super.beforeOnCreateView(layoutInflater, viewGroup, bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0Y = AbstractC31175DnJ.A0Y(requireArguments(), "analytics_entrypoint");
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            this.A00 = new L7D(this, A0r, A0Y, AbstractC1345466e.A07(A00));
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36329676658065901L)) {
                L7D l7d = this.A00;
                if (l7d == null) {
                    AbstractC31171DnF.A0s();
                    throw C00O.createAndThrow();
                }
                l7d.A00(EnumC46300KeW.IMAGINE_BUTTON_IMPRESSION, null);
                C05A c05a = ((C44538Jmi) this.A03.getValue()).A06;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, C32072E6y.A00((C32072E6y) value, null, null, null, null, AbstractC001800i.A0S((Iterable) C44538Jmi.A0A.getValue(), AbstractC166987dD.A1J(new C27207BzQ(C05F.A0C, R.drawable.instagram_gen_ai_pano_outline_24, 2131964304))), 247, false)));
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0t();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public EIL() {
        C37052GUi c37052GUi = new C37052GUi(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37052GUi(new C37052GUi(this, 31), 32));
        this.A03 = AbstractC25225BEi.A0a(new C37052GUi(A00, 33), c37052GUi, new C50170MDx(3, null, A00), AbstractC25225BEi.A1D(C44538Jmi.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object value;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            C44538Jmi c44538Jmi = (C44538Jmi) this.A03.getValue();
            Context requireContext = requireContext();
            String action = intent.getAction();
            if (action != null) {
                android.net.Uri A0B = AbstractC25227BEk.A0B(action);
                if (A0B.getScheme() != null || (A0B = AbstractC08820cl.A03(AnonymousClass001.A0R("file://", action))) != null) {
                    Bitmap A00 = C55620On5.A00(requireContext, A0B, c44538Jmi.A00, 1);
                    if (A00 == null) {
                        C0w9.A03("ThreadDetailCustomGroupNameAndImageViewModel", "Failed to load group photo bitmap");
                        return;
                    }
                    A00.getWidth();
                    File A04 = AbstractC13530mf.A04(requireContext);
                    C14360o3.A07(A04);
                    C1NC.A0M(A00, A04);
                    A00.recycle();
                    C05A c05a = c44538Jmi.A06;
                    do {
                        value = c05a.getValue();
                    } while (!c05a.AIi(value, C32072E6y.A00((C32072E6y) value, null, A04, null, null, null, 222, true)));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-512642427);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 42), 1584209244);
        C0f9.A09(254577466, A02);
        return A00;
    }
}
