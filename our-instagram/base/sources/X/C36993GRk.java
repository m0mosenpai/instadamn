package X;

import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.GRk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36993GRk implements InterfaceC16660sJ {
    public final /* synthetic */ C159737El A00;
    public final /* synthetic */ String A01;

    public C36993GRk(C159737El c159737El, String str) {
        this.A00 = c159737El;
        this.A01 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewStub A07;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C159737El c159737El = this.A00;
        UserSession userSession = c159737El.A1Z;
        if (!AbstractC162267Oo.A03(userSession) && (A07 = AbstractC31171DnF.A07(c159737El.A07, R.id.meta_ai_nux_disclaimer)) != null && spannableStringBuilder != null) {
            IgTextView igTextView = (IgTextView) A07.inflate();
            c159737El.A0G = igTextView;
            igTextView.setText(spannableStringBuilder);
            AbstractC25227BEk.A11(c159737El.A0G);
            C7F3 c7f3 = c159737El.A0J;
            String A0F = C159737El.A0F(c159737El);
            String str = this.A01;
            C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
            if (AbstractC25226BEj.A1Z(A0H)) {
                A0H.A0Y(0);
                A0H.A0Z(19);
                A0H.A0X(1);
                A0H.A0M(EnumC72433Xdd.A02, "thread_type");
                A0H.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0F);
                A0H.A0R("agent_id", str);
                A0H.A0M(EnumC33519Ers.A0I, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0H.Cht();
            }
            AbstractC162267Oo.A01(userSession, true);
        }
        return C0eB.A00;
    }
}
