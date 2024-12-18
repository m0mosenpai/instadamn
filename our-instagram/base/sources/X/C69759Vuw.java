package X;

import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.Vuw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69759Vuw {
    public final boolean A00;
    public final InterfaceC11360iu A01;
    public final C1QE A02;

    public final void A00(InterfaceC11380iw interfaceC11380iw, User user, String str, String str2) {
        C19280xC A04 = this.A02.A04("select_victim_page_loaded");
        A04.A0C("event_type", "page_load");
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        A04.A0C("source_analytics_module", interfaceC11380iw.getModuleName());
        if (user != null && !this.A00) {
            A04.A0C(AbstractC43591JPw.A00(52), user.getId());
        }
        this.A01.EHW(A04);
    }

    public final void A01(User user, String str, String str2, String str3) {
        C19280xC A04 = this.A02.A04("frx_prompt_button_clicked");
        A04.A0C("event_type", "click");
        if (str3 != null) {
            A04.A0C("action_type", str3);
        }
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        if (user != null && !this.A00) {
            A04.A0C(AbstractC43591JPw.A00(52), user.getId());
        }
        this.A01.EHW(A04);
    }

    public final void A02(User user, String str, String str2, String str3) {
        C19280xC A04 = this.A02.A04("frx_prompt_button_impression");
        A04.A0C("event_type", "impression");
        if (str3 != null) {
            A04.A0C("action_type", str3);
        }
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        if (user != null && !this.A00) {
            A04.A0C(AbstractC43591JPw.A00(52), user.getId());
        }
        this.A01.EHW(A04);
    }

    public C69759Vuw(InterfaceC11360iu interfaceC11360iu, C1QE c1qe, boolean z) {
        this.A01 = interfaceC11360iu;
        this.A02 = c1qe;
        this.A00 = z;
    }
}
