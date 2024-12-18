package X;

import android.view.View;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* loaded from: classes8.dex */
public final class KLG extends AbstractViewOnClickListenerC13340mK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLG(C7QY c7qy, C49123Lo2 c49123Lo2) {
        super(1000L);
        this.A00 = 0;
        this.A02 = c49123Lo2;
        this.A01 = c7qy;
    }

    @Override // X.AbstractViewOnClickListenerC13340mK
    public final void A00(View view) {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                C49017Lm5 c49017Lm5 = ((C49123Lo2) this.A02).A06;
                C7QY c7qy = (C7QY) this.A01;
                C47359Kw8 c47359Kw8 = c49017Lm5.A00;
                C1583978z c1583978z = c7qy.A0H;
                if (c1583978z == null || (str = Long.valueOf(c1583978z.A00).toString()) == null) {
                    str = "";
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "open_existing_poll");
                EnumC46277Ke9 enumC46277Ke9 = EnumC46277Ke9.POLL_XMA_VOTE_BUTTON;
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("question_id", str);
                c0Zx.A01(enumC46277Ke9, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AbstractC43592JPx.A1L(A0f, c0Zx);
                List list = c7qy.A0b;
                if (list == null || 0 >= list.size()) {
                    return;
                }
                C9CP c9cp = (C9CP) list.get(0);
                String str4 = c9cp.A04;
                String str5 = c9cp.A05;
                String str6 = c9cp.A06;
                String str7 = c9cp.A02;
                String str8 = c9cp.A03;
                if (str5 == null) {
                    str2 = "PollMessageClickDelegate";
                    str3 = "Null XMA CTA Type";
                    break;
                } else {
                    C7Ze c7Ze = c49017Lm5.A01;
                    if (((InterfaceC165507ad) c7Ze).CQu()) {
                        return;
                    }
                    c7Ze.CKa(null, c7qy.A0B.A04, c7qy.A0L, null, 0, str4, str5, str6, str7, str8, c7qy.A08.A00, ((InterfaceC164917Zg) c7Ze).C7d(), null, null, null);
                    return;
                }
                break;
            case 1:
                C7QY c7qy2 = (C7QY) this.A01;
                DirectMessageIdentifier directMessageIdentifier = c7qy2.A0L;
                if (directMessageIdentifier.A02 == null) {
                    return;
                }
                C49020Lm8 c49020Lm8 = ((Lo0) this.A02).A0A;
                List list2 = c7qy2.A0b;
                if (list2 == null) {
                    return;
                }
                C9CP c9cp2 = (C9CP) list2.get(0);
                String str9 = c9cp2.A04;
                String str10 = c9cp2.A05;
                String str11 = c9cp2.A06;
                String str12 = c9cp2.A02;
                String str13 = c9cp2.A03;
                if (str11 == null) {
                    str2 = "PromptXmaMessageClickDelegate";
                    str3 = "Null CTA fields";
                    break;
                } else {
                    InterfaceC164987Zn interfaceC164987Zn = c49020Lm8.A01;
                    if (interfaceC164987Zn == null) {
                        return;
                    }
                    ((C7Ze) interfaceC164987Zn).CKa(null, c7qy2.A0B.A04, directMessageIdentifier, null, 0, str9, str10, str11, str12, str13, c7qy2.A08.A00, ((InterfaceC164917Zg) interfaceC164987Zn).C7d(), directMessageIdentifier.A00, null, null);
                    return;
                }
            default:
                return;
        }
        C0w9.A03(str2, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLG(C7QY c7qy, Lo0 lo0, int i) {
        super(2000L);
        this.A00 = i;
        this.A01 = c7qy;
        this.A02 = lo0;
    }
}
