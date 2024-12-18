package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LfH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48639LfH implements InterfaceC58042PoS {
    public C189478aR A00;
    public C189448aO A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A05;
    public final String A06;
    public final InterfaceC11380iw A08;
    public final String A07 = AbstractC167017dG.A0j();
    public final C49523Luc A04 = new C49523Luc(this, 2);

    @Override // X.InterfaceC58042PoS
    public final void Eo2(EnumC46263Kdv enumC46263Kdv, EnumC203578zI enumC203578zI, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        C8BN c8bn;
        FragmentActivity activity;
        Resources.Theme theme;
        C14360o3.A0B(num, 1);
        UserSession userSession = this.A05;
        JQ1.A0k(userSession, num);
        int intValue = num.intValue();
        if (intValue != 12) {
            if (intValue != 13) {
                c8bn = null;
            } else {
                c8bn = C8BN.FEED_DIALOG_REPLACE_AUDIO;
            }
        } else {
            c8bn = C8BN.ADD_AUDIO;
        }
        if (this.A00 == null) {
            EnumC1810381f enumC1810381f = EnumC1810381f.A05;
            String str2 = this.A07;
            MusicProduct musicProduct = MusicProduct.A0G;
            ImmutableList A0M = AbstractC43594JPz.A0M();
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            C52166N6v A00 = OPX.A00(null, c8bn, null, A0M, null, musicProduct, userSession, null, null, enumC1810381f, str2, C38801rC.A06(this.A06), null, null, false, !C1H6.A03(), false);
            A00.A05 = this.A04;
            if (!C1H6.A03() && (activity = this.A03.getActivity()) != null && (theme = activity.getTheme()) != null) {
                theme.applyStyle(R.style.MusicCreationLightOverlayTheme, true);
            }
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
            A0X.A03 = 1.0f;
            Context context = this.A02;
            A0X.A06 = context.getColor(AbstractC53242c7.A0D(context));
            A0X.A0T = A00;
            this.A01 = A0X;
            this.A00 = C189478aR.A00(context, context, A00, A0X.A00(), null);
        }
    }

    @Override // X.InterfaceC58042PoS
    public final void dismiss() {
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A07();
        }
        this.A00 = null;
    }

    public C48639LfH(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = context;
        this.A05 = userSession;
        this.A03 = fragment;
        this.A06 = str;
        this.A08 = interfaceC11380iw;
    }
}
