package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.HcD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39485HcD extends AbstractC25917BdK {
    public String A00;
    public final int A01;
    public final Activity A02;
    public final TextView A03;
    public final TextView A04;
    public final C07X A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final IgCheckBox A08;
    public final IgImageView A09;
    public final IgImageView A0A;
    public final IgImageView A0B;
    public final C38321qM A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC16660sJ A0E;
    public final boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39485HcD(Activity activity, View view, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = activity;
        this.A07 = userSession;
        this.A0C = c38321qM;
        this.A06 = interfaceC11380iw;
        this.A05 = c07x;
        this.A0F = z;
        this.A0E = interfaceC16660sJ;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.caption_text);
        this.A03 = A0N;
        this.A04 = AbstractC167007dF.A0N(view, R.id.username_text);
        this.A09 = AbstractC167007dF.A0T(view, R.id.image);
        this.A0B = AbstractC167007dF.A0T(view, R.id.source_type_icon);
        this.A0A = AbstractC167007dF.A0T(view, R.id.navigate_to_media_button);
        this.A08 = (IgCheckBox) AbstractC166997dE.A0R(view, R.id.save_button);
        this.A00 = "";
        this.A01 = AbstractC167017dG.A05(view.getContext());
        this.A0D = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(this, 4));
        AbstractC85953sP.A04(A0N);
    }

    @Override // X.AbstractC25917BdK
    public final void A01(AbstractC29162CtT abstractC29162CtT) {
        String str;
        String BS0;
        String str2;
        InterfaceC1118152j interfaceC1118152j;
        boolean z;
        Boolean CcM;
        InterfaceC1118052h Bym;
        InterfaceC1118052h C0V;
        String str3;
        C14360o3.A0B(abstractC29162CtT, 0);
        if (abstractC29162CtT instanceof HE0) {
            HE0 he0 = (HE0) abstractC29162CtT;
            String str4 = he0.A04;
            this.A00 = str4;
            UserSession userSession = this.A07;
            if (C18U.A06(C06090Tz.A05, userSession, 36323019458620266L)) {
                IgImageView igImageView = this.A09;
                Resources A0M = AbstractC25228BEl.A0M(this.itemView);
                C14360o3.A07(A0M);
                AbstractC23121AKf.A02(A0M, igImageView, AbstractC167017dG.A06(he0.A03));
                InterfaceC1118152j interfaceC1118152j2 = he0.A00;
                String str5 = null;
                if (interfaceC1118152j2 != null) {
                    str = interfaceC1118152j2.C0o();
                } else {
                    str = null;
                }
                boolean A0K = C14360o3.A0K(str, "image");
                InterfaceC1118152j interfaceC1118152j3 = he0.A00;
                if (A0K) {
                    if (interfaceC1118152j3 != null) {
                        str3 = interfaceC1118152j3.BS0();
                    } else {
                        str3 = null;
                    }
                    igImageView.setUrl(AbstractC25225BEi.A0t(str3), this.A06);
                } else if (interfaceC1118152j3 != null && (BS0 = interfaceC1118152j3.BS0()) != null) {
                    igImageView.setImageDrawable(new C8OT(AbstractC37301Gc2.A03(this), null, userSession, str4, BS0, AbstractC25228BEl.A0M(this.itemView).getDimensionPixelSize(R.dimen.call_participant_text_max_width), AbstractC25228BEl.A0M(this.itemView).getDimensionPixelSize(R.dimen.video_cutout_sticker_height)));
                }
                TextView textView = this.A03;
                InterfaceC1118152j interfaceC1118152j4 = he0.A00;
                if (interfaceC1118152j4 != null && (C0V = interfaceC1118152j4.C0V()) != null) {
                    str2 = C0V.getUsername();
                } else {
                    str2 = null;
                }
                textView.setText(str2);
                InterfaceC1118152j interfaceC1118152j5 = he0.A00;
                if (interfaceC1118152j5 != null && (Bym = interfaceC1118152j5.Bym()) != null) {
                    InterfaceC1118152j interfaceC1118152j6 = he0.A00;
                    if (interfaceC1118152j6 != null) {
                        str5 = interfaceC1118152j6.C0o();
                    }
                    if (C14360o3.A0K(str5, MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        this.A0B.setImageResource(R.drawable.instagram_reels_pano_filled_24);
                    }
                    this.A0B.setVisibility(0);
                    TextView textView2 = this.A04;
                    textView2.setText(Bym.getUsername());
                    textView2.setPadding(this.A01, 0, 0, 0);
                    textView2.setVisibility(0);
                    C0fQ.A00(new ViewOnClickListenerC42027Ijw(8, he0, this), this.itemView);
                }
                this.A0A.setVisibility(8);
                if (!this.A0F && (interfaceC1118152j = he0.A00) != null && interfaceC1118152j.CcL()) {
                    IgCheckBox igCheckBox = this.A08;
                    InterfaceC1118152j interfaceC1118152j7 = he0.A00;
                    if (interfaceC1118152j7 != null && (CcM = interfaceC1118152j7.CcM()) != null) {
                        z = CcM.booleanValue();
                    } else {
                        z = false;
                    }
                    igCheckBox.setChecked(z);
                    C0fQ.A00(new ViewOnClickListenerC42027Ijw(9, he0, this), igCheckBox);
                    igCheckBox.setVisibility(0);
                    return;
                }
                return;
            }
            String url = he0.A01.getUrl();
            C14360o3.A07(url);
            if (url.length() == 0) {
                AbstractC166987dD.A1Z(new C57153PYx(he0, this, (InterfaceC23621Ds) null, 22), C07Y.A00(this.A05));
            }
            A00(he0, this);
            C0fQ.A00(new ViewOnClickListenerC42027Ijw(7, he0, this), this.itemView);
            return;
        }
        throw AbstractC166987dD.A12("Failed requirement.");
    }

    public static final void A00(HE0 he0, C39485HcD c39485HcD) {
        c39485HcD.A03.setText(he0.A02);
        TextView textView = c39485HcD.A04;
        textView.setText(he0.A05);
        textView.setVisibility(0);
        String url = he0.A01.getUrl();
        C14360o3.A07(url);
        int length = url.length();
        IgImageView igImageView = c39485HcD.A09;
        if (length == 0) {
            igImageView.setImageDrawable(new ColorDrawable(AbstractC167007dF.A09(AbstractC31172DnG.A05(c39485HcD), R.attr.igds_color_photo_placeholder)));
        } else {
            igImageView.setUrl(he0.A01, c39485HcD.A06);
        }
    }
}
