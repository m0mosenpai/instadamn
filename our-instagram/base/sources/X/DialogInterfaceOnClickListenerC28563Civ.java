package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Civ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28563Civ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public DialogInterfaceOnClickListenerC28563Civ(EOK eok, String str, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A01 = eok;
            this.A02 = str;
        } else {
            this.A02 = str;
            this.A01 = eok;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C25531Mh A00;
        String str2;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                String str5 = this.A02;
                if (C14360o3.A0K(str5, "in_thread_add_example_dialogue")) {
                    A00 = C28484Chc.A00((C28484Chc) this.A01);
                    if (!AbstractC25226BEj.A1Z(A00)) {
                        return;
                    } else {
                        str2 = "thread_view_add_example_dialogue_submit_for_review_dialog_cancel_clicked";
                    }
                } else {
                    if (!C14360o3.A0K(str5, "in_thread_instruction")) {
                        return;
                    }
                    A00 = C28484Chc.A00((C28484Chc) this.A01);
                    if (!AbstractC25226BEj.A1Z(A00)) {
                        return;
                    } else {
                        str2 = "thread_view_add_instruction_submit_for_review_dialog_cancel_clicked";
                    }
                }
                A00.A0k(str2);
                A00.Cht();
                return;
            case 1:
                C12260kU.A05(AbstractC08820cl.A03(this.A02), (Fragment) this.A01);
                return;
            case 2:
                String str6 = this.A02;
                if (str6 == null) {
                    return;
                }
                EOK eok = (EOK) this.A01;
                C36297Fzr c36297Fzr = eok.A02;
                if (c36297Fzr != null) {
                    String str7 = eok.A0C;
                    if (str7 != null) {
                        DirectThreadKey directThreadKey = eok.A08;
                        if (directThreadKey != null) {
                            String str8 = directThreadKey.A01;
                            int i2 = eok.A00;
                            String str9 = eok.A0D;
                            if (str9 != null) {
                                boolean z = eok.A0H;
                                C09530e4 A1L = AbstractC166987dD.A1L("user_type", str9);
                                if (z) {
                                    str4 = "ACTIVE";
                                } else {
                                    str4 = "ENDED";
                                }
                                C36297Fzr.A02(c36297Fzr, str7, str8, "delete_daily_prompt_response", "tap", "delete_button", "delete_daily_prompt_response_dialog", AbstractC25232BEp.A1F("daily_prompt_submission_id", str6, A1L, AbstractC166987dD.A1L("daily_prompt_status", str4)), i2);
                                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(eok.A0K);
                                AbstractC166987dD.A1Z(new PYc(A0Z, str6, null, 33), AbstractC141776au.A00(A0Z));
                                return;
                            }
                            str3 = "userType";
                            C14360o3.A0F(str3);
                            throw C00O.createAndThrow();
                        }
                        str3 = "threadKey";
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                    str3 = "threadId";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                str3 = "dailyPromptsLogger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 3:
                C14360o3.A0B(dialogInterface, 0);
                EOK eok2 = (EOK) this.A01;
                C36297Fzr c36297Fzr2 = eok2.A02;
                if (c36297Fzr2 != null) {
                    String str10 = eok2.A0C;
                    if (str10 != null) {
                        DirectThreadKey directThreadKey2 = eok2.A08;
                        if (directThreadKey2 != null) {
                            String str11 = directThreadKey2.A01;
                            String str12 = this.A02;
                            int i3 = eok2.A00;
                            String str13 = eok2.A0D;
                            if (str13 != null) {
                                boolean z2 = eok2.A0H;
                                C09530e4 A1L2 = AbstractC166987dD.A1L("user_type", str13);
                                if (z2) {
                                    str = "ACTIVE";
                                } else {
                                    str = "ENDED";
                                }
                                C36297Fzr.A02(c36297Fzr2, str10, str11, "delete_daily_prompt_response_cancel", "tap", "cancel_button", "delete_daily_prompt_response_dialog", AbstractC25232BEp.A1F("daily_prompt_submission_id", str12, A1L2, AbstractC166987dD.A1L("daily_prompt_status", str)), i3);
                                dialogInterface.dismiss();
                                return;
                            }
                            str3 = "userType";
                            C14360o3.A0F(str3);
                            throw C00O.createAndThrow();
                        }
                        str3 = "threadKey";
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                    str3 = "threadId";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                str3 = "dailyPromptsLogger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            default:
                return;
        }
    }

    public DialogInterfaceOnClickListenerC28563Civ(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }
}
