package X;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9F6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9F6 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9F6(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, int i) {
        super(0);
        this.A00 = i;
        if (9 - i != 0) {
            this.A01 = interfaceC09390do;
            this.A02 = interfaceC09390do2;
        } else {
            this.A02 = interfaceC09390do;
            this.A01 = interfaceC09390do2;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        switch (this.A00) {
            case 0:
                return new C159697Eh(((AnonymousClass982) this.A02).A01, (InterfaceC08830cm) this.A01);
            case 1:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A02;
                return new G4P(anonymousClass982.A00.requireActivity(), anonymousClass982.A01, (InterfaceC08830cm) this.A01);
            case 2:
                final InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A01;
                final C163867Va c163867Va = (C163867Va) this.A02;
                return new InterfaceC165497ac(c163867Va, interfaceC08830cm) { // from class: X.7Sn
                    public final C163867Va A00;
                    public final InterfaceC08830cm A01;

                    {
                        C14360o3.A0B(interfaceC08830cm, 1);
                        C14360o3.A0B(c163867Va, 2);
                        this.A01 = interfaceC08830cm;
                        this.A00 = c163867Va;
                    }

                    @Override // X.InterfaceC165497ac
                    public final void EZ6(MessageIdentifier messageIdentifier, boolean z) {
                        C14360o3.A0B(messageIdentifier, 0);
                        ((C7U0) this.A01.get()).BT6().EQe(messageIdentifier, z);
                        AnonymousClass983.A01(this.A00.A00).A0Q();
                    }

                    @Override // X.InterfaceC165507ad
                    public final boolean CQu() {
                        return ((C7U0) this.A01.get()).BT6().Ain();
                    }
                };
            case 3:
                AnonymousClass982 anonymousClass9822 = (AnonymousClass982) this.A02;
                return new G4A(anonymousClass9822.A00.requireActivity(), anonymousClass9822.A01, (C163867Va) this.A01);
            case 4:
                return new C36411G4m((InterfaceC164947Zj) ((InterfaceC09390do) this.A02).getValue(), new C50165MDs(this.A01, 3));
            case 5:
                return new C1580377n(((AnonymousClass982) this.A02).A01, new C9GX(this.A01, 10));
            case 6:
                return new C7MJ((UserSession) this.A02, (Context) this.A01);
            case 7:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
            case 8:
                return new C92884Ee((UserSession) this.A02, ((InterfaceC11380iw) this.A01).getModuleName());
            case 9:
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), (C49127Lo6) ((InterfaceC09390do) this.A02).getValue());
            case 10:
                C7MW c7mw = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49103Lng(c7mw.A08, c7mw.A09));
            case 11:
                C7MW c7mw2 = (C7MW) this.A02;
                C7ZX c7zx = c7mw2.A08;
                AnonymousClass988 anonymousClass988 = c7mw2.A09;
                return new AbstractC1584479e((C79Z) ((InterfaceC09390do) this.A01).getValue(), C158907Bc.A00(c7zx, anonymousClass988), new C7RY(c7mw2.A06, c7mw2.A07, c7zx, anonymousClass988));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C7MW c7mw3 = (C7MW) this.A02;
                C7ZX c7zx2 = c7mw3.A08;
                AnonymousClass988 anonymousClass9882 = c7mw3.A09;
                return new AbstractC1584479e((C79Z) ((InterfaceC09390do) this.A01).getValue(), C158907Bc.A00(c7zx2, anonymousClass9882), new C7T9(c7mw3.A06, c7mw3.A07, c7zx2, anonymousClass9882));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C7MW c7mw4 = (C7MW) this.A02;
                C7ZX c7zx3 = c7mw4.A08;
                return new AbstractC1584479e((C79Z) ((InterfaceC09390do) this.A01).getValue(), C158907Bc.A00(c7zx3, c7mw4.A09), new C49109Lnm(c7mw4.A06, c7mw4.A07, c7zx3));
            case 14:
                C7MW c7mw5 = (C7MW) this.A02;
                C7ZX c7zx4 = c7mw5.A08;
                AnonymousClass988 anonymousClass9883 = c7mw5.A09;
                C7RX c7rx = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                UserSession userSession = c7mw5.A07;
                InterfaceC11380iw interfaceC11380iw = c7mw5.A06;
                C14360o3.A0B(c7rx, 2);
                C14360o3.A0B(interfaceC11380iw, 4);
                return new AbstractC162927Rd(c7rx, new C7RY(interfaceC11380iw, userSession, c7zx4, anonymousClass9883));
            case Process.SIGTERM /* 15 */:
                C7MW c7mw6 = (C7MW) this.A02;
                return new C219959nh((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49102Lnf(c7mw6.A08, c7mw6.A09), KV2.class);
            case 16:
                C7MW c7mw7 = (C7MW) this.A02;
                UserSession userSession2 = c7mw7.A07;
                InterfaceC11380iw interfaceC11380iw2 = c7mw7.A06;
                C7ZX c7zx5 = c7mw7.A08;
                AnonymousClass988 anonymousClass9884 = c7mw7.A09;
                C7RX c7rx2 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(interfaceC11380iw2, 1);
                C14360o3.A0B(c7rx2, 4);
                return new AbstractC162927Rd(c7rx2, new C7T9(interfaceC11380iw2, userSession2, c7zx5, anonymousClass9884));
            case 17:
                C7MW c7mw8 = (C7MW) this.A02;
                C49118Lnv c49118Lnv = new C49118Lnv(c7mw8.A06, c7mw8.A07, c7mw8.A08, c7mw8.A09);
                C7RX c7rx3 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx3, 2);
                return new AbstractC162927Rd(c7rx3, c49118Lnv);
            case 18:
                C7MW c7mw9 = (C7MW) this.A02;
                C49108Lnl c49108Lnl = new C49108Lnl(c7mw9.A06, c7mw9.A08, c7mw9.A09);
                C7RX c7rx4 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx4, 2);
                return new AbstractC162927Rd(c7rx4, c49108Lnl);
            case Process.SIGSTOP /* 19 */:
                C7MW c7mw10 = (C7MW) this.A02;
                C49110Lnn c49110Lnn = new C49110Lnn(c7mw10.A06, c7mw10.A08, c7mw10.A09);
                C7RX c7rx5 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx5, 2);
                return new AbstractC162927Rd(c7rx5, c49110Lnn);
            case 20:
                C7MW c7mw11 = (C7MW) this.A02;
                C49120Lnx c49120Lnx = new C49120Lnx(c7mw11.A06, c7mw11.A08, c7mw11.A09);
                C7RX c7rx6 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx6, 2);
                return new AbstractC162927Rd(c7rx6, c49120Lnx);
            case 21:
                C7MW c7mw12 = (C7MW) this.A02;
                return new C219959nh((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49102Lnf(c7mw12.A08, c7mw12.A09), KV1.class);
            case 22:
                C7MW c7mw13 = (C7MW) this.A02;
                G5C g5c = new G5C(c7mw13.A06, c7mw13.A07, c7mw13.A08);
                C7RX c7rx7 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx7, 2);
                return new AbstractC162927Rd(c7rx7, g5c);
            case 23:
                C7MW c7mw14 = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49104Lnh(c7mw14.A06, c7mw14.A08, c7mw14.A09));
            case 24:
                C7MW c7mw15 = (C7MW) this.A02;
                UserSession userSession3 = c7mw15.A07;
                C7ZX c7zx6 = c7mw15.A08;
                AnonymousClass988 anonymousClass9885 = c7mw15.A09;
                C7RX c7rx8 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                InterfaceC11380iw interfaceC11380iw3 = c7mw15.A06;
                C14360o3.A0B(c7rx8, 3);
                C14360o3.A0B(interfaceC11380iw3, 4);
                return new AbstractC162927Rd(c7rx8, new LayeredXmaContentDefinition(interfaceC11380iw3, userSession3, c7zx6, anonymousClass9885, false));
            case 25:
                C7MW c7mw16 = (C7MW) this.A02;
                UserSession userSession4 = c7mw16.A07;
                C7ZX c7zx7 = c7mw16.A08;
                AnonymousClass988 anonymousClass9886 = c7mw16.A09;
                InterfaceC11380iw interfaceC11380iw4 = c7mw16.A06;
                C79Z c79z = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw4, 3);
                C14360o3.A0B(c79z, 4);
                return new AbstractC1584479e(c79z, C158907Bc.A00(c7zx7, anonymousClass9886), new LayeredXmaContentDefinition(interfaceC11380iw4, userSession4, c7zx7, anonymousClass9886, true));
            case 26:
                C7MW c7mw17 = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49100Lnd(c7mw17.A08, c7mw17.A09));
            case 27:
                C7MW c7mw18 = (C7MW) this.A02;
                return AbstractC46817KnC.A00(c7mw18.A04, c7mw18.A06, c7mw18.A07, (C75Y) c7mw18.A0B.getValue(), new C219969ni(((C7RV) ((InterfaceC09390do) this.A01).getValue()).A04), c7mw18.A08, c7mw18.A09);
            case 28:
                C7MW c7mw19 = (C7MW) this.A02;
                return AbstractC46799Kmu.A00(c7mw19.A03, c7mw19.A06, c7mw19.A07, (C7RX) ((InterfaceC09390do) this.A01).getValue(), c7mw19.A08, c7mw19.A09);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C7MW c7mw20 = (C7MW) this.A02;
                C49117Lnu c49117Lnu = new C49117Lnu(c7mw20.A06, c7mw20.A07, c7mw20.A08, c7mw20.A09);
                C7RX c7rx9 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx9, 2);
                return new AbstractC162927Rd(c7rx9, c49117Lnu);
            case 30:
                C7MW c7mw21 = (C7MW) this.A02;
                C7ZX c7zx8 = c7mw21.A08;
                AnonymousClass988 anonymousClass9887 = c7mw21.A09;
                C7RX c7rx10 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                InterfaceC11380iw interfaceC11380iw5 = c7mw21.A06;
                UserSession userSession5 = c7mw21.A07;
                C14360o3.A0B(c7rx10, 2);
                C14360o3.A0B(interfaceC11380iw5, 3);
                return new AbstractC162927Rd(c7rx10, new C49132LoB(interfaceC11380iw5, userSession5, null, c7zx8, anonymousClass9887, null, null, false));
            case 31:
                C7MW c7mw22 = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49106Lnj(c7mw22.A06, c7mw22.A08, c7mw22.A09));
            case 32:
                C7MW c7mw23 = (C7MW) this.A02;
                UserSession userSession6 = c7mw23.A07;
                C7ZX c7zx9 = c7mw23.A08;
                AnonymousClass988 anonymousClass9888 = c7mw23.A09;
                C7RX c7rx11 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                InterfaceC11380iw interfaceC11380iw6 = c7mw23.A06;
                C14360o3.A0B(c7rx11, 4);
                C14360o3.A0B(interfaceC11380iw6, 5);
                return new AbstractC162927Rd(c7rx11, LC4.A00(interfaceC11380iw6, userSession6, c7zx9, anonymousClass9888, false));
            case 33:
                C7MW c7mw24 = (C7MW) this.A02;
                UserSession userSession7 = c7mw24.A07;
                C7ZX c7zx10 = c7mw24.A08;
                AnonymousClass988 anonymousClass9889 = c7mw24.A09;
                C7RX c7rx12 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                InterfaceC11380iw interfaceC11380iw7 = c7mw24.A06;
                C14360o3.A0B(c7rx12, 4);
                C14360o3.A0B(interfaceC11380iw7, 5);
                return new AbstractC162927Rd(c7rx12, LC4.A00(interfaceC11380iw7, userSession7, c7zx10, anonymousClass9889, true));
            case 34:
                C7MW c7mw25 = (C7MW) this.A02;
                return AbstractC22708A0e.A00(c7mw25.A06, c7mw25.A07, (C75Y) c7mw25.A0B.getValue(), new C219969ni(((C7RV) ((InterfaceC09390do) this.A01).getValue()).A04), c7mw25.A08, c7mw25.A09);
            case 35:
                C7RX c7rx13 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C1579977j c1579977j = (C1579977j) ((InterfaceC09390do) this.A02).getValue();
                C14360o3.A0B(c7rx13, 0);
                C14360o3.A0B(c1579977j, 1);
                return new AbstractC162927Rd(c7rx13, c1579977j);
            case 36:
                C7MW c7mw26 = (C7MW) this.A02;
                Context context = c7mw26.A04;
                UserSession userSession8 = c7mw26.A07;
                C7ZX c7zx11 = c7mw26.A08;
                AnonymousClass988 anonymousClass98810 = c7mw26.A09;
                C79Z c79z2 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z2, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw8 = c7mw26.A06;
                C14360o3.A0B(c79z2, 4);
                C14360o3.A0B(interfaceC11380iw8, 5);
                return new AbstractC1584479e(c79z2, new C1586479z(context, interfaceC11380iw8, userSession8, c7zx11, anonymousClass98810), new C79T(userSession8, c7zx11, anonymousClass98810));
            case 37:
                C7MW c7mw27 = (C7MW) this.A02;
                Context context2 = c7mw27.A04;
                UserSession userSession9 = c7mw27.A07;
                C7ZX c7zx12 = c7mw27.A08;
                AnonymousClass988 anonymousClass98811 = c7mw27.A09;
                C79Z c79z3 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z3, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw9 = c7mw27.A06;
                C14360o3.A0B(c79z3, 4);
                C14360o3.A0B(interfaceC11380iw9, 5);
                return new AbstractC1584479e(c79z3, new C1586479z(context2, interfaceC11380iw9, userSession9, c7zx12, anonymousClass98811), new C1586479z(context2, interfaceC11380iw9, userSession9, c7zx12, anonymousClass98811));
            case 38:
                C7MW c7mw28 = (C7MW) this.A02;
                Context context3 = c7mw28.A04;
                UserSession userSession10 = c7mw28.A07;
                C7ZX c7zx13 = c7mw28.A08;
                AnonymousClass988 anonymousClass98812 = c7mw28.A09;
                C79Z c79z4 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z4, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw10 = c7mw28.A06;
                C14360o3.A0B(c79z4, 4);
                C14360o3.A0B(interfaceC11380iw10, 5);
                return new AbstractC1584479e(c79z4, new C1586479z(context3, interfaceC11380iw10, userSession10, c7zx13, anonymousClass98812), new C7RY(interfaceC11380iw10, userSession10, c7zx13, anonymousClass98812));
            case 39:
                C7MW c7mw29 = (C7MW) this.A02;
                Context context4 = c7mw29.A04;
                UserSession userSession11 = c7mw29.A07;
                C7ZX c7zx14 = c7mw29.A08;
                AnonymousClass988 anonymousClass98813 = c7mw29.A09;
                C79Z c79z5 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z5, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw11 = c7mw29.A06;
                C14360o3.A0B(c79z5, 4);
                C14360o3.A0B(interfaceC11380iw11, 5);
                return new AbstractC1584479e(c79z5, new C1586479z(context4, interfaceC11380iw11, userSession11, c7zx14, anonymousClass98813), new C7T9(interfaceC11380iw11, userSession11, c7zx14, anonymousClass98813));
            case 40:
                C7MW c7mw30 = (C7MW) this.A02;
                Context context5 = c7mw30.A04;
                UserSession userSession12 = c7mw30.A07;
                C7ZX c7zx15 = c7mw30.A08;
                AnonymousClass988 anonymousClass98814 = c7mw30.A09;
                C79Z c79z6 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z6, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw12 = c7mw30.A06;
                C14360o3.A0B(c79z6, 4);
                C14360o3.A0B(interfaceC11380iw12, 5);
                return new AbstractC1584479e(c79z6, new C1586479z(context5, interfaceC11380iw12, userSession12, c7zx15, anonymousClass98814), A0Z.A00(interfaceC11380iw12, userSession12, c7zx15, anonymousClass98814));
            case Seq.NULL_REFNUM /* 41 */:
                C7MW c7mw31 = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49101Lne(c7mw31.A08, c7mw31.A09));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C7MW c7mw32 = (C7MW) this.A02;
                UserSession userSession13 = c7mw32.A07;
                C7ZX c7zx16 = c7mw32.A08;
                AnonymousClass988 anonymousClass98815 = c7mw32.A09;
                C79Z c79z7 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z7, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw13 = c7mw32.A06;
                C14360o3.A0B(c79z7, 3);
                C14360o3.A0B(interfaceC11380iw13, 4);
                return new AbstractC1584479e(c79z7, new C7RY(interfaceC11380iw13, userSession13, c7zx16, anonymousClass98815), new C79T(userSession13, c7zx16, anonymousClass98815));
            case 43:
                C7MW c7mw33 = (C7MW) this.A02;
                Context context6 = c7mw33.A04;
                UserSession userSession14 = c7mw33.A07;
                C7ZX c7zx17 = c7mw33.A08;
                AnonymousClass988 anonymousClass98816 = c7mw33.A09;
                C79Z c79z8 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z8, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw14 = c7mw33.A06;
                C14360o3.A0B(c79z8, 4);
                C14360o3.A0B(interfaceC11380iw14, 5);
                return new AbstractC1584479e(c79z8, new C7RY(interfaceC11380iw14, userSession14, c7zx17, anonymousClass98816), new C1586479z(context6, interfaceC11380iw14, userSession14, c7zx17, anonymousClass98816));
            case 44:
                C7MW c7mw34 = (C7MW) this.A02;
                UserSession userSession15 = c7mw34.A07;
                C7ZX c7zx18 = c7mw34.A08;
                AnonymousClass988 anonymousClass98817 = c7mw34.A09;
                C79Z c79z9 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z9, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw15 = c7mw34.A06;
                C14360o3.A0B(c79z9, 4);
                C14360o3.A0B(interfaceC11380iw15, 5);
                return new AbstractC1584479e(c79z9, new C7T9(interfaceC11380iw15, userSession15, c7zx18, anonymousClass98817), new C7RY(interfaceC11380iw15, userSession15, c7zx18, anonymousClass98817));
            case 45:
                C7MW c7mw35 = (C7MW) this.A02;
                UserSession userSession16 = c7mw35.A07;
                C7ZX c7zx19 = c7mw35.A08;
                AnonymousClass988 anonymousClass98818 = c7mw35.A09;
                C79Z c79z10 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z10, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw16 = c7mw35.A06;
                C14360o3.A0B(c79z10, 4);
                C14360o3.A0B(interfaceC11380iw16, 5);
                return new AbstractC1584479e(c79z10, new C7T9(interfaceC11380iw16, userSession16, c7zx19, anonymousClass98818), new C7T9(interfaceC11380iw16, userSession16, c7zx19, anonymousClass98818));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C7MW c7mw36 = (C7MW) this.A02;
                UserSession userSession17 = c7mw36.A07;
                C7ZX c7zx20 = c7mw36.A08;
                AnonymousClass988 anonymousClass98819 = c7mw36.A09;
                C79Z c79z11 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z11, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw17 = c7mw36.A06;
                C14360o3.A0B(c79z11, 4);
                C14360o3.A0B(interfaceC11380iw17, 5);
                return new AbstractC1584479e(c79z11, new C7RY(interfaceC11380iw17, userSession17, c7zx20, anonymousClass98819), new C7T9(interfaceC11380iw17, userSession17, c7zx20, anonymousClass98819));
            case 47:
                C7MW c7mw37 = (C7MW) this.A02;
                UserSession userSession18 = c7mw37.A07;
                C7ZX c7zx21 = c7mw37.A08;
                AnonymousClass988 anonymousClass98820 = c7mw37.A09;
                C79Z c79z12 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z12, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw18 = c7mw37.A06;
                C14360o3.A0B(c79z12, 4);
                C14360o3.A0B(interfaceC11380iw18, 5);
                return new AbstractC1584479e(c79z12, new C7RY(interfaceC11380iw18, userSession18, c7zx21, anonymousClass98820), new C7RY(interfaceC11380iw18, userSession18, c7zx21, anonymousClass98820));
            case 48:
                C7MW c7mw38 = (C7MW) this.A02;
                UserSession userSession19 = c7mw38.A07;
                C7ZX c7zx22 = c7mw38.A08;
                AnonymousClass988 anonymousClass98821 = c7mw38.A09;
                C79Z c79z13 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z13, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw19 = c7mw38.A06;
                C14360o3.A0B(c79z13, 4);
                C14360o3.A0B(interfaceC11380iw19, 5);
                return new AbstractC1584479e(c79z13, new C7RY(interfaceC11380iw19, userSession19, c7zx22, anonymousClass98821), A0Z.A00(interfaceC11380iw19, userSession19, c7zx22, anonymousClass98821));
            default:
                C7MW c7mw39 = (C7MW) this.A02;
                UserSession userSession20 = c7mw39.A07;
                C7ZX c7zx23 = c7mw39.A08;
                AnonymousClass988 anonymousClass98822 = c7mw39.A09;
                C79Z c79z14 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z14, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw20 = c7mw39.A06;
                C14360o3.A0B(c79z14, 3);
                C14360o3.A0B(interfaceC11380iw20, 4);
                return new AbstractC1584479e(c79z14, new C7T9(interfaceC11380iw20, userSession20, c7zx23, anonymousClass98822), new C79T(userSession20, c7zx23, anonymousClass98822));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9F6(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
