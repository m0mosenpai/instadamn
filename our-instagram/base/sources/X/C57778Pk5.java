package X;

import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment;

/* renamed from: X.Pk5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57778Pk5 extends C0YT {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57778Pk5(C33151Eju c33151Eju, Object obj) {
        super(obj);
        this.A00 = 1;
        this.A01 = c33151Eju;
    }

    @Override // X.C0YT
    public final void A00(Object obj, Object obj2, C0YR c0yr) {
        float f;
        String str;
        PromptStickerModel promptStickerModel;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                String str4 = (String) obj2;
                if (C14360o3.A0K(obj, str4)) {
                    return;
                }
                C33151Eju c33151Eju = (C33151Eju) this.A01;
                if (str4 != null && !AbstractC001900j.A0T(str4)) {
                    str = AbstractC25228BEl.A1A(str4);
                } else {
                    str = null;
                }
                AbstractC31171DnF.A1S(c33151Eju, str, c33151Eju.A0A, C33151Eju.A0C, 0);
                return;
            case 1:
                boolean A1a = AbstractC166987dD.A1a(obj2);
                ELn eLn = (ELn) this.A01;
                EQ8 A0A = eLn.A0A();
                boolean z = !A1a;
                A0A.A04 = z;
                int itemCount = A0A.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    C32069E6v c32069E6v = (C32069E6v) A0A.getModelForPosition(C32069E6v.class, i);
                    if (c32069E6v != null) {
                        c32069E6v.A00 = z;
                        A0A.notifyItemChanged(i);
                    }
                }
                eLn.requireView().findViewById(R.id.done_button).setEnabled(z);
                TextView A0e = AbstractC166987dD.A0e(eLn.requireView(), R.id.list_name_edit_text);
                A0e.setEnabled(z);
                if (A1a) {
                    A0e.setInputType(0);
                    f = 0.5f;
                } else {
                    A0e.setInputType(1);
                    f = 1.0f;
                }
                A0e.setAlpha(f);
                return;
            default:
                C51703MsY c51703MsY = (C51703MsY) obj2;
                if (!C14360o3.A0K(obj, c51703MsY) && c51703MsY != null && (promptStickerModel = c51703MsY.A04) != null && (str2 = promptStickerModel.A03) != null && str2.length() > 0) {
                    Long l = null;
                    String str5 = c51703MsY.A07;
                    if (str5 == null) {
                        str5 = "";
                    }
                    long j = c51703MsY.A00;
                    C60220Qvu c60220Qvu = c51703MsY.A05;
                    if (c60220Qvu != null) {
                        l = AbstractC37302Gc3.A0V(c60220Qvu.A07("strong_id__"));
                    }
                    String str6 = c51703MsY.A08;
                    if (str6 == null) {
                        str6 = "";
                    }
                    StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment = (StoryTemplateDiscoverySurfaceFragment) this.A01;
                    String str7 = storyTemplateDiscoverySurfaceFragment.viewerSessionId;
                    UserSession A0r = AbstractC166987dD.A0r(storyTemplateDiscoverySurfaceFragment.session$delegate);
                    C19270xB A0D = AbstractC31171DnF.A0D("StoryTemplateDiscoverySurfaceFragment");
                    EnumC39612HeM enumC39612HeM = c51703MsY.A02;
                    AbstractC167017dG.A1T(str7, A0r);
                    C14360o3.A0B(enumC39612HeM, 8);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A0D, A0r), "ig_story_template_impression");
                    if (A0f.isSampled()) {
                        AbstractC37300Gc1.A0l(A0f, str5);
                        A0f.A9K("m_t", Long.valueOf(j));
                        Double A0Y = MSY.A0Y();
                        A0f.A8I("time_elapsed", A0Y);
                        A0f.A8I("time_remaining", A0Y);
                        A0f.AAP("tray_session_id", "");
                        AbstractC25225BEi.A1P(A0f, str7);
                        A0f.AAP("reel_id", str6);
                        AbstractC31171DnF.A1C(A0f, "impression");
                        A0f.AAP("template_id", str2);
                        int ordinal = enumC39612HeM.ordinal();
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    str3 = null;
                                } else {
                                    str3 = "add_yours_templates_discovery_surface_international_hits";
                                }
                            } else {
                                str3 = "add_yours_templates_discovery_surface_hot_right_now";
                            }
                        } else {
                            str3 = "add_yours_templates_discovery_surface_find_it_first";
                        }
                        A0f.AAP("template_section", str3);
                        A0f.A9K("a_pk", l);
                        A0f.Cht();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57778Pk5(Object obj, int i) {
        super(null);
        this.A00 = i;
        this.A01 = obj;
    }
}
