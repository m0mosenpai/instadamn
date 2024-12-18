package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MHI extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHI(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C160587Hs A00(StringBuilder sb, MHI mhi) {
        sb.append('@');
        C160587Hs c160587Hs = (C160587Hs) mhi.A01;
        Context context = c160587Hs.A07.getContext();
        AbstractC31265Don.A00();
        sb.append((Object) context.getText(2131960572));
        sb.append(' ');
        return c160587Hs;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
            case 1:
                return C023409i.A0A.A05(this.A01);
            case 2:
            case 3:
                Dialog dialog = ((C0SG) this.A01).A01;
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            case 4:
                return AbstractC166987dD.A0d(((C160657Hz) this.A01).A07).requireViewById(R.id.link_preview_bar_background);
            case 5:
                View inflate = ((C160657Hz) this.A01).A05.inflate();
                AbstractC43592JPx.A1T(inflate);
                return inflate;
            case 6:
                return AbstractC166987dD.A0d(((C160657Hz) this.A01).A07).requireViewById(R.id.link_preview_bar_divider);
            case 7:
                return AbstractC166987dD.A0d(((C160657Hz) this.A01).A07).requireViewById(R.id.link_preview_bar_subtitle);
            case 8:
                return Integer.valueOf(AbstractC167017dG.A03(((C160657Hz) this.A01).A04));
            case 9:
                return AbstractC166987dD.A0d(((C160657Hz) this.A01).A07).requireViewById(R.id.link_preview_bar_image);
            case 10:
                return AbstractC166987dD.A0d(((C160657Hz) this.A01).A07).requireViewById(R.id.link_preview_bar_title);
            case 11:
                ((C7HO) this.A01).A00.invoke();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC166987dD.A0d(((L8B) this.A01).A07).requireViewById(R.id.close_edit_bar_icon);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                View inflate2 = ((L8B) this.A01).A04.inflate();
                AbstractC43592JPx.A1T(inflate2);
                return inflate2;
            case 14:
                return AbstractC166987dD.A0d(((L8B) this.A01).A07).requireViewById(R.id.edit_bar_divider);
            case Process.SIGTERM /* 15 */:
                return AbstractC166987dD.A0d(((L8B) this.A01).A07).requireViewById(R.id.edit_bar_header);
            case 16:
                StringBuilder A1C = AbstractC166987dD.A1C();
                Context context = ((C160587Hs) this.A01).A07.getContext();
                AbstractC31265Don.A00();
                A1C.append((Object) context.getText(2131960663));
                A1C.append(' ');
                return A1C.toString();
            case 17:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C160587Hs) this.A01).A08, 36326833389582487L);
            case 18:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C160587Hs) this.A01).A08, 36326833389648024L);
            case Process.SIGSTOP /* 19 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C160587Hs) this.A01).A08, 36326833389713561L);
            case 20:
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                return AbstractC166997dE.A0x(AbstractC25225BEi.A15(A00(A1C2, this).A0A), A1C2);
            case 21:
                StringBuilder A1C3 = AbstractC166987dD.A1C();
                return AbstractC166997dE.A0x(AbstractC25225BEi.A15(A00(A1C3, this).A0I), A1C3);
            case 22:
                StringBuilder A1C4 = AbstractC166987dD.A1C();
                A1C4.append('@');
                Context context2 = ((C160587Hs) this.A01).A07.getContext();
                AbstractC31265Don.A00();
                return AbstractC166997dE.A0v(context2.getText(2131960572), A1C4);
            case 23:
                return AnonymousClass001.A0D(AbstractC25225BEi.A15(((C160587Hs) this.A01).A0A), '/');
            case 24:
                List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A06, ((C160587Hs) this.A01).A08, 36890178479981432L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                ArrayList A0q = AbstractC167017dG.A0q(A0m);
                Iterator it = A0m.iterator();
                while (it.hasNext()) {
                    A0q.add(AnonymousClass001.A0C(AbstractC25228BEl.A1A(AbstractC166987dD.A1B(it)), ' '));
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : A0q) {
                    AbstractC25228BEl.A1Q(obj, A1E, AbstractC001900j.A0T((String) obj) ? 1 : 0);
                }
                return A1E;
            case 25:
                C189448aO A0y = AbstractC25225BEi.A0y(((C47772L7u) this.A01).A02);
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A0x = true;
                A0y.A1G = true;
                A0y.A03 = 0.7f;
                return A0y;
            case 26:
                C47772L7u c47772L7u = (C47772L7u) this.A01;
                return new C7FR(c47772L7u.A01, c47772L7u.A02);
            case 27:
                return AbstractC147806l5.A00(((C35152Feu) this.A01).A03);
            case 28:
                return AbstractC43594JPz.A0C(((C47973LIh) this.A01).A0A);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return Boolean.valueOf(((C2EF) this.A01).Cd4());
            case 30:
                OWH owh = OWH.A00;
                C48510Ld2 c48510Ld2 = (C48510Ld2) this.A01;
                owh.A00(AbstractC166987dD.A0O(c48510Ld2.A00), c48510Ld2.A02);
                break;
            case 31:
                return new C56134Ovu((UserSession) this.A01);
            case 32:
            case 36:
                return AbstractC25235BEs.A0U(this.A01);
            case 33:
            case 37:
                return new C32565EVp(AbstractC31172DnG.A0C(this.A01));
            case 34:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case 35:
                return new C32565EVp((Activity) this.A01);
            case 38:
                Context context3 = AbstractC12290kX.A00;
                C14360o3.A07(context3);
                return new G02(context3, (UserSession) this.A01);
            case 39:
                return new C43914JbP((UserSession) this.A01);
            case 40:
                return new C2RB((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C2RB((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
            case 45:
            case 47:
            default:
                return AbstractC28761aE.A00((UserSession) this.A01);
            case 43:
                return AbstractC28761aE.A00(((C32631gn) this.A01).A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC28761aE.A00(((C32691gt) this.A01).A00);
            case 48:
                return AbstractC28761aE.A00(((C32571gh) this.A01).A00);
        }
        return C0eB.A00;
    }
}
