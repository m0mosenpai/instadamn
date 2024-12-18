package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.7R9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R9 implements C7QC {
    public final UserSession A00;
    public final C7YI A01;
    public final InterfaceC11380iw A02;

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADy(C162947Rf c162947Rf, final C162717Qi c162717Qi) {
        C14360o3.A0B(c162947Rf, 0);
        C14360o3.A0B(c162717Qi, 1);
        if (c162717Qi.A01 instanceof C7SW) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.7Sd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-213639785);
                    C7R9 c7r9 = C7R9.this;
                    C7YI c7yi = c7r9.A01;
                    if (c7yi != null) {
                        C162717Qi c162717Qi2 = c162717Qi;
                        AbstractC162707Qh abstractC162707Qh = c162717Qi2.A01;
                        C14360o3.A0C(abstractC162707Qh, "null cannot be cast to non-null type com.instagram.direct.messagethread.senderavatar.model.SenderAvatarViewModel.Visibility.Visible");
                        MessagingUser messagingUser = ((C7SW) abstractC162707Qh).A00;
                        IGAIAgentType iGAIAgentType = messagingUser.A01;
                        if (iGAIAgentType != null) {
                            int ordinal = iGAIAgentType.ordinal();
                            if (ordinal != 3) {
                                if (ordinal == 4 || ordinal == 2) {
                                    Context context = view.getContext();
                                    C14360o3.A07(context);
                                    UserSession userSession = c7r9.A00;
                                    if (C18U.A06(C06090Tz.A05, userSession, 36325081046528731L)) {
                                        WTZ wtz = new WTZ(null, false, null, 50, 1.0f, false, false, false, true);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        if (new BitSet(0).nextClearBit(0) >= 0) {
                                            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.ig.aistudio.ai_profile.bottomsheet", null, null, AbstractC06930Yk.A0B(linkedHashMap), AbstractC06930Yk.A0E(), 719983200, 0L, true);
                                            AnonymousClass637 A00 = VRA.A00(userSession, false);
                                            C14360o3.A0B(A00, 1);
                                            c63719SsZ.E2V(context, wtz, A00);
                                        } else {
                                            throw new IllegalStateException(AbstractC43591JPw.A00(266));
                                        }
                                    }
                                }
                            } else {
                                if (C18U.A06(C06090Tz.A05, c7r9.A00, 36330213528847088L)) {
                                    C14360o3.A0A(view);
                                    c7yi.CrK(view, messagingUser);
                                } else {
                                    c7yi.Cgg(c162717Qi2.A00, messagingUser);
                                }
                            }
                        }
                        c7yi.Cre(messagingUser, "direct_thread_sender_avatar");
                    }
                    C0f9.A0C(1333675778, A05);
                }
            };
            C57012jc c57012jc = c162947Rf.A00;
            ImageUrl imageUrl = c162717Qi.A00;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            C14360o3.A0B(c57012jc, 0);
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            IgImageView igImageView = (IgImageView) A01;
            if (imageUrl == null) {
                igImageView.A09();
            } else {
                igImageView.setUrl(imageUrl, interfaceC11380iw);
            }
            igImageView.setVisibility(0);
            C0fQ.A00(onClickListener, igImageView);
            return;
        }
        C57012jc c57012jc2 = c162947Rf.A00;
        C14360o3.A0B(c57012jc2, 0);
        c57012jc2.A03(8);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.sender_avatar_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C162947Rf(new C57012jc((ViewStub) inflate));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
    }

    public C7R9(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7YI c7yi) {
        this.A02 = interfaceC11380iw;
        this.A01 = c7yi;
        this.A00 = userSession;
    }
}
