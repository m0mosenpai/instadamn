package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207209Ez extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207209Ez(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, int i) {
        super(0);
        this.A00 = i;
        switch (i) {
            case 0:
            case 8:
            case 14:
            case Process.SIGSTOP /* 19 */:
            case 20:
                this.A02 = interfaceC09390do;
                this.A01 = interfaceC09390do2;
                break;
            default:
                this.A01 = interfaceC09390do;
                this.A02 = interfaceC09390do2;
                break;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C49131LoA c49131LoA = (C49131LoA) ((InterfaceC09390do) this.A02).getValue();
                C7RX c7rx = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c49131LoA, 1);
                C14360o3.A0B(c7rx, 2);
                return new AbstractC162927Rd(c7rx, c49131LoA);
            case 1:
                C7MW c7mw = (C7MW) this.A02;
                Context context = c7mw.A04;
                UserSession userSession = c7mw.A07;
                C7ZX c7zx = c7mw.A08;
                AnonymousClass988 anonymousClass988 = c7mw.A09;
                C79Z c79z = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw = c7mw.A06;
                C14360o3.A0B(c79z, 4);
                C14360o3.A0B(interfaceC11380iw, 5);
                return new AbstractC1584479e(c79z, new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(context, interfaceC11380iw, userSession, c7zx, anonymousClass988));
            case 2:
                C7MW c7mw2 = (C7MW) this.A02;
                UserSession userSession2 = c7mw2.A07;
                C7ZX c7zx2 = c7mw2.A08;
                AnonymousClass988 anonymousClass9882 = c7mw2.A09;
                C79Z c79z2 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z2, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw2 = c7mw2.A06;
                C14360o3.A0B(c79z2, 4);
                C14360o3.A0B(interfaceC11380iw2, 5);
                return new AbstractC1584479e(c79z2, new C7T9(interfaceC11380iw2, userSession2, c7zx2, anonymousClass9882), A0Z.A00(interfaceC11380iw2, userSession2, c7zx2, anonymousClass9882));
            case 3:
                C7MW c7mw3 = (C7MW) this.A02;
                WjT wjT = new WjT(c7mw3.A05, c7mw3.A07);
                C7RX c7rx2 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx2, 2);
                return new AbstractC162927Rd(c7rx2, wjT);
            case 4:
                C7MW c7mw4 = (C7MW) this.A02;
                UserSession userSession3 = c7mw4.A07;
                C7ZX c7zx3 = c7mw4.A08;
                AnonymousClass988 anonymousClass9883 = c7mw4.A09;
                C7RV c7rv = (C7RV) ((InterfaceC09390do) this.A01).getValue();
                AnonymousClass988 anonymousClass9884 = c7rv.A02;
                C7R8 c7r8 = c7rv.A04;
                C7RF c7rf = c7rv.A03;
                C7R9 c7r9 = c7rv.A06;
                C7RW c7rw = new C7RW(null, null, null, c7rv.A00, null, c7rv.A01, anonymousClass9884, null, null, null, c7rf, null, c7r8, c7rv.A05, c7r9, null, null, null, null, null, null, null, null);
                InterfaceC11380iw interfaceC11380iw3 = c7mw4.A06;
                C14360o3.A0B(interfaceC11380iw3, 4);
                List singletonList = Collections.singletonList(AbstractC1575875s.A01(new C49022LmA(interfaceC11380iw3, userSession3, c7zx3), c7zx3, anonymousClass9883));
                C14360o3.A07(singletonList);
                return new AbstractC162927Rd(c7rw, new C49129Lo8(interfaceC11380iw3, userSession3, c7zx3, new C162907Rb(singletonList)));
            case 5:
                C7MW c7mw5 = (C7MW) this.A02;
                UserSession userSession4 = c7mw5.A07;
                C7ZX c7zx4 = c7mw5.A08;
                AnonymousClass988 anonymousClass9885 = c7mw5.A09;
                C219969ni c219969ni = new C219969ni(((C7RV) ((InterfaceC09390do) this.A01).getValue()).A04);
                C75Y c75y = (C75Y) c7mw5.A0B.getValue();
                InterfaceC11380iw interfaceC11380iw4 = c7mw5.A06;
                C14360o3.A0B(interfaceC11380iw4, 5);
                C49024LmC c49024LmC = new C49024LmC(c7zx4);
                C1580177l A01 = AbstractC1575875s.A01(c49024LmC, c7zx4, anonymousClass9885);
                C1580177l A012 = AbstractC1575875s.A01(C23913Aig.A00, c7zx4, anonymousClass9885);
                List singletonList2 = Collections.singletonList(A01);
                C14360o3.A07(singletonList2);
                return new AbstractC162927Rd(c219969ni, new C49124Lo3(interfaceC11380iw4, userSession4, c75y, c7zx4, c7zx4, c49024LmC, (C163437Tg) userSession4.A01(C163437Tg.class, C163427Tf.A00), new C162907Rb(singletonList2), A012));
            case 6:
                C7MW c7mw6 = (C7MW) this.A02;
                return AbstractC1586379y.A00(c7mw6.A04, c7mw6.A06, c7mw6.A07, (C7RX) ((InterfaceC09390do) this.A01).getValue(), c7mw6.A08, c7mw6.A09);
            case 7:
                C49114Lnr c49114Lnr = (C49114Lnr) ((InterfaceC09390do) this.A01).getValue();
                C7RX c7rx3 = (C7RX) ((InterfaceC09390do) this.A02).getValue();
                C14360o3.A0B(c49114Lnr, 1);
                C14360o3.A0B(c7rx3, 2);
                return new AbstractC162927Rd(c7rx3, c49114Lnr);
            case 8:
                C49116Lnt c49116Lnt = (C49116Lnt) ((InterfaceC09390do) this.A02).getValue();
                C7RX c7rx4 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c49116Lnt, 1);
                C14360o3.A0B(c7rx4, 2);
                return new AbstractC162927Rd(c7rx4, c49116Lnt);
            case 9:
                C7MW c7mw7 = (C7MW) this.A02;
                C7ZX c7zx5 = c7mw7.A08;
                AnonymousClass988 anonymousClass9886 = c7mw7.A09;
                return new C1584379d((C79Z) ((InterfaceC09390do) this.A01).getValue(), new C79T(c7mw7.A07, c7zx5, anonymousClass9886), C158907Bc.A00(c7zx5, anonymousClass9886), C1584079a.class);
            case 10:
                C7MW c7mw8 = (C7MW) this.A02;
                C7ZX c7zx6 = c7mw8.A08;
                AnonymousClass988 anonymousClass9887 = c7mw8.A09;
                return new C1584379d((C79Z) ((InterfaceC09390do) this.A01).getValue(), new C79T(c7mw8.A07, c7zx6, anonymousClass9887), C158907Bc.A00(c7zx6, anonymousClass9887), KVG.class);
            case 11:
                C7MW c7mw9 = (C7MW) this.A02;
                C7ZX c7zx7 = c7mw9.A08;
                AnonymousClass988 anonymousClass9888 = c7mw9.A09;
                C79Z c79z3 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z3, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.placeholder.PlaceholderContentViewHolder>");
                C14360o3.A0B(c79z3, 2);
                return new AbstractC1584479e(c79z3, C158907Bc.A00(c7zx7, anonymousClass9888), null);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C7MW c7mw10 = (C7MW) this.A02;
                Context context2 = c7mw10.A04;
                UserSession userSession5 = c7mw10.A07;
                C7ZX c7zx8 = c7mw10.A08;
                AnonymousClass988 anonymousClass9889 = c7mw10.A09;
                InterfaceC11380iw interfaceC11380iw5 = c7mw10.A06;
                C79Z c79z4 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z4, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C14360o3.A0B(interfaceC11380iw5, 4);
                C14360o3.A0B(c79z4, 5);
                return new AbstractC1584479e(c79z4, C158907Bc.A00(c7zx8, anonymousClass9889), new C1586479z(context2, interfaceC11380iw5, userSession5, c7zx8, anonymousClass9889));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C7MW c7mw11 = (C7MW) this.A02;
                UserSession userSession6 = c7mw11.A07;
                C7ZX c7zx9 = c7mw11.A08;
                AnonymousClass988 anonymousClass98810 = c7mw11.A09;
                C79Z c79z5 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z5, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw6 = c7mw11.A06;
                C14360o3.A0B(c79z5, 3);
                C14360o3.A0B(interfaceC11380iw6, 4);
                return new AbstractC1584479e(c79z5, C158907Bc.A00(c7zx9, anonymousClass98810), A0Z.A00(interfaceC11380iw6, userSession6, c7zx9, anonymousClass98810));
            case 14:
                C49112Lnp c49112Lnp = (C49112Lnp) ((InterfaceC09390do) this.A02).getValue();
                C7RX c7rx5 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c49112Lnp, 1);
                C14360o3.A0B(c7rx5, 2);
                return new AbstractC162927Rd(c7rx5, c49112Lnp);
            case Process.SIGTERM /* 15 */:
                C7MW c7mw12 = (C7MW) this.A02;
                C7ZX c7zx10 = c7mw12.A08;
                AnonymousClass988 anonymousClass98811 = c7mw12.A09;
                C49102Lnf c49102Lnf = new C49102Lnf(c7zx10, anonymousClass98811);
                C79Z c79z6 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z6, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.placeholder.PlaceholderContentViewHolder>");
                C14360o3.A0B(c79z6, 3);
                return new AbstractC1584479e(c79z6, C158907Bc.A00(c7zx10, anonymousClass98811), c49102Lnf);
            case 16:
                C7MW c7mw13 = (C7MW) this.A02;
                C7ZX c7zx11 = c7mw13.A08;
                AnonymousClass988 anonymousClass98812 = c7mw13.A09;
                C78Z c78z = new C78Z(c7zx11, anonymousClass98812);
                C79Z c79z7 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z7, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>");
                C14360o3.A0B(c79z7, 3);
                return new AbstractC1584479e(c79z7, C158907Bc.A00(c7zx11, anonymousClass98812), c78z);
            case 17:
                C7MW c7mw14 = (C7MW) this.A02;
                UserSession userSession7 = c7mw14.A07;
                InterfaceC11380iw interfaceC11380iw7 = c7mw14.A06;
                C7ZX c7zx12 = c7mw14.A08;
                AnonymousClass988 anonymousClass98813 = c7mw14.A09;
                C7T9 c7t9 = new C7T9(interfaceC11380iw7, userSession7, c7zx12, anonymousClass98813);
                C78Z c78z2 = new C78Z(c7zx12, anonymousClass98813);
                C79Z c79z8 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z8, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>");
                C14360o3.A0B(c79z8, 3);
                return new AbstractC1584479e(c79z8, c7t9, c78z2);
            case 18:
                C7MW c7mw15 = (C7MW) this.A02;
                C78Z c78z3 = new C78Z(c7mw15.A08, c7mw15.A09);
                C7RX c7rx6 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx6, 2);
                return new AbstractC162927Rd(c7rx6, c78z3);
            case Process.SIGSTOP /* 19 */:
                return new AnonymousClass767((C7RX) ((InterfaceC09390do) this.A01).getValue(), null, (C158677Ad) ((InterfaceC09390do) this.A02).getValue(), C76J.class);
            case 20:
                C158677Ad c158677Ad = (C158677Ad) ((InterfaceC09390do) this.A02).getValue();
                C7RX c7rx7 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c158677Ad, 1);
                C14360o3.A0B(c7rx7, 2);
                return new AbstractC162927Rd(c7rx7, c158677Ad);
            case 21:
                C7MW c7mw16 = (C7MW) this.A02;
                UserSession userSession8 = c7mw16.A07;
                C7ZX c7zx13 = c7mw16.A08;
                AnonymousClass988 anonymousClass98814 = c7mw16.A09;
                InterfaceC11380iw interfaceC11380iw8 = c7mw16.A06;
                final C79Z c79z9 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z9, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                final Class<C45935KUm> cls = C45935KUm.class;
                C14360o3.A0B(interfaceC11380iw8, 3);
                C14360o3.A0B(c79z9, 4);
                final C158907Bc A00 = C158907Bc.A00(c7zx13, anonymousClass98814);
                final LayeredXmaContentDefinition layeredXmaContentDefinition = new LayeredXmaContentDefinition(interfaceC11380iw8, userSession8, c7zx13, anonymousClass98814, false);
                return new AbstractC1584479e(c79z9, layeredXmaContentDefinition, A00, cls) { // from class: X.9ns
                    public final Class A00;

                    @Override // X.AbstractC66422zJ
                    public final Class modelClass() {
                        return this.A00;
                    }

                    {
                        this.A00 = cls;
                    }
                };
            case 22:
                C7MW c7mw17 = (C7MW) this.A02;
                UserSession userSession9 = c7mw17.A07;
                C7ZX c7zx14 = c7mw17.A08;
                AnonymousClass988 anonymousClass98815 = c7mw17.A09;
                InterfaceC11380iw interfaceC11380iw9 = c7mw17.A06;
                final C79Z c79z10 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z10, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                final Class<C45934KUl> cls2 = C45934KUl.class;
                C14360o3.A0B(interfaceC11380iw9, 3);
                C14360o3.A0B(c79z10, 4);
                final C158907Bc A002 = C158907Bc.A00(c7zx14, anonymousClass98815);
                final LayeredXmaContentDefinition layeredXmaContentDefinition2 = new LayeredXmaContentDefinition(interfaceC11380iw9, userSession9, c7zx14, anonymousClass98815, false);
                return new AbstractC1584479e(c79z10, layeredXmaContentDefinition2, A002, cls2) { // from class: X.9ns
                    public final Class A00;

                    @Override // X.AbstractC66422zJ
                    public final Class modelClass() {
                        return this.A00;
                    }

                    {
                        this.A00 = cls2;
                    }
                };
            case 23:
                C7MW c7mw18 = (C7MW) this.A02;
                C7ZX c7zx15 = c7mw18.A08;
                AnonymousClass988 anonymousClass98816 = c7mw18.A09;
                InterfaceC11380iw interfaceC11380iw10 = c7mw18.A06;
                C7RX c7rx8 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(interfaceC11380iw10, 2);
                C14360o3.A0B(c7rx8, 3);
                boolean z = anonymousClass98816.A1U;
                return new AbstractC162927Rd(c7rx8, new C48105LRf(AbstractC16960so.A1Q(new C1580177l(new C162897Ra(c7zx15), new C77Z(c7zx15, 1, 0, false), new C158657Ab(c7zx15, z), new C7Q9(c7zx15, z), c7zx15, anonymousClass98816, null, false), new C49141LoK(c7zx15)), interfaceC11380iw10));
            case 24:
                C7MW c7mw19 = (C7MW) this.A02;
                UserSession userSession10 = c7mw19.A07;
                C7ZX c7zx16 = c7mw19.A08;
                AnonymousClass988 anonymousClass98817 = c7mw19.A09;
                C7RX c7rx9 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx9, 3);
                boolean z2 = anonymousClass98817.A1U;
                List singletonList3 = Collections.singletonList(new C1580177l(new C162897Ra(c7zx16), new C49005Llt(userSession10), new C158657Ab(c7zx16, z2), new C7Q9(c7zx16, z2), c7zx16, anonymousClass98817, null, true));
                C14360o3.A07(singletonList3);
                return new AbstractC162927Rd(c7rx9, new C48104LRe(singletonList3));
            case 25:
                C7MW c7mw20 = (C7MW) this.A02;
                C7ZX c7zx17 = c7mw20.A08;
                AnonymousClass988 anonymousClass98818 = c7mw20.A09;
                C7RX c7rx10 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                InterfaceC11380iw interfaceC11380iw11 = c7mw20.A06;
                C14360o3.A0B(c7rx10, 2);
                C14360o3.A0B(interfaceC11380iw11, 3);
                return new AbstractC162927Rd(c7rx10, new C49105Lni(interfaceC11380iw11, c7zx17, anonymousClass98818));
            case 26:
                C7MW c7mw21 = (C7MW) this.A02;
                C7ZX c7zx18 = c7mw21.A08;
                AnonymousClass988 anonymousClass98819 = c7mw21.A09;
                InterfaceC11380iw interfaceC11380iw12 = c7mw21.A06;
                C79Z c79z11 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z11, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.magicmediaremix.MagicMediaRemixContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw12, 4);
                C14360o3.A0B(c79z11, 5);
                return new AbstractC1584479e(c79z11, C158907Bc.A00(c7zx18, anonymousClass98819), new C49105Lni(interfaceC11380iw12, c7zx18, anonymousClass98819));
            case 27:
                C7MW c7mw22 = (C7MW) this.A02;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), C158907Bc.A00(c7mw22.A08, c7mw22.A09));
            case 28:
                C7MW c7mw23 = (C7MW) this.A02;
                C7ZX c7zx19 = c7mw23.A08;
                AnonymousClass988 anonymousClass98820 = c7mw23.A09;
                InterfaceC11380iw interfaceC11380iw13 = c7mw23.A06;
                C79Z c79z12 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z12, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw13, 2);
                C14360o3.A0B(c79z12, 3);
                return new AbstractC1584479e(c79z12, C158907Bc.A00(c7zx19, anonymousClass98820), new C48105LRf(AbstractC16960so.A1Q(AbstractC1575875s.A00(new C162897Ra(c7zx19), new C77Z(c7zx19, 1, 0, false), c7zx19, anonymousClass98820), new C49143LoM(c7zx19)), interfaceC11380iw13));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C7MW c7mw24 = (C7MW) this.A02;
                C7ZX c7zx20 = c7mw24.A08;
                AnonymousClass988 anonymousClass98821 = c7mw24.A09;
                InterfaceC11380iw interfaceC11380iw14 = c7mw24.A06;
                C79Z c79z13 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z13, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw14, 2);
                C14360o3.A0B(c79z13, 3);
                return new AbstractC1584479e(c79z13, C158907Bc.A00(c7zx20, anonymousClass98821), new C48105LRf(AbstractC16960so.A1Q(AbstractC1575875s.A00(new C162897Ra(c7zx20), new C77Z(c7zx20, 1, 0, false), c7zx20, anonymousClass98821), new C49142LoL(c7zx20)), interfaceC11380iw14));
            case 30:
                C7MW c7mw25 = (C7MW) this.A02;
                UserSession userSession11 = c7mw25.A07;
                C7ZX c7zx21 = c7mw25.A08;
                AnonymousClass988 anonymousClass98822 = c7mw25.A09;
                InterfaceC11380iw interfaceC11380iw15 = c7mw25.A06;
                C79Z c79z14 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z14, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw15, 3);
                C14360o3.A0B(c79z14, 4);
                return new AbstractC1584479e(c79z14, A0Z.A00(interfaceC11380iw15, userSession11, c7zx21, anonymousClass98822), new C48105LRf(AbstractC16960so.A1Q(AbstractC1575875s.A00(new C162897Ra(c7zx21), new C77Z(c7zx21, 1, 0, false), c7zx21, anonymousClass98822), new C49140LoJ(c7zx21)), interfaceC11380iw15));
            case 31:
                C7MW c7mw26 = (C7MW) this.A02;
                UserSession userSession12 = c7mw26.A07;
                C7ZX c7zx22 = c7mw26.A08;
                AnonymousClass988 anonymousClass98823 = c7mw26.A09;
                InterfaceC11380iw interfaceC11380iw16 = c7mw26.A06;
                C79Z c79z15 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z15, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw16, 3);
                C14360o3.A0B(c79z15, 4);
                return new AbstractC1584479e(c79z15, new C7T9(interfaceC11380iw16, userSession12, c7zx22, anonymousClass98823), new C48105LRf(AbstractC16960so.A1Q(AbstractC1575875s.A00(new C162897Ra(c7zx22), new C77Z(c7zx22, 1, 0, false), c7zx22, anonymousClass98823), new C49144LoN(c7zx22)), interfaceC11380iw16));
            case 32:
                C7MW c7mw27 = (C7MW) this.A02;
                C7ZX c7zx23 = c7mw27.A08;
                C7RX c7rx11 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                AnonymousClass988 anonymousClass98824 = c7mw27.A09;
                UserSession userSession13 = c7mw27.A07;
                C14360o3.A0B(c7rx11, 1);
                return new AbstractC162927Rd(c7rx11, new C79T(userSession13, c7zx23, anonymousClass98824));
            case 33:
                C7MW c7mw28 = (C7MW) this.A02;
                UserSession userSession14 = c7mw28.A07;
                C7ZX c7zx24 = c7mw28.A08;
                AnonymousClass988 anonymousClass98825 = c7mw28.A09;
                InterfaceC11380iw interfaceC11380iw17 = c7mw28.A06;
                C79Z c79z16 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z16, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.multimedia.MultiMediaContentViewHolder>");
                C14360o3.A0B(interfaceC11380iw17, 3);
                C14360o3.A0B(c79z16, 4);
                return new AbstractC1584479e(c79z16, C158907Bc.A00(c7zx24, anonymousClass98825), new C49132LoB(interfaceC11380iw17, userSession14, null, c7zx24, anonymousClass98825, null, null, true));
            case 34:
                C7MW c7mw29 = (C7MW) this.A02;
                UserSession userSession15 = c7mw29.A07;
                C7ZX c7zx25 = c7mw29.A08;
                AnonymousClass988 anonymousClass98826 = c7mw29.A09;
                InterfaceC11380iw interfaceC11380iw18 = c7mw29.A06;
                C79Z c79z17 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z17, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.PromptXmaMessageViewHolder>");
                C14360o3.A0B(interfaceC11380iw18, 4);
                C14360o3.A0B(c79z17, 5);
                return new AbstractC1584479e(c79z17, C158907Bc.A00(c7zx25, anonymousClass98826), AbstractC46818KnD.A00(interfaceC11380iw18, userSession15, c7zx25, anonymousClass98826, false));
            case 35:
                C7MW c7mw30 = (C7MW) this.A02;
                UserSession userSession16 = c7mw30.A07;
                C7ZX c7zx26 = c7mw30.A08;
                AnonymousClass988 anonymousClass98827 = c7mw30.A09;
                InterfaceC11380iw interfaceC11380iw19 = c7mw30.A06;
                C79Z c79z18 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z18, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.PromptXmaMessageViewHolder>");
                C14360o3.A0B(interfaceC11380iw19, 4);
                C14360o3.A0B(c79z18, 5);
                return new AbstractC1584479e(c79z18, C158907Bc.A00(c7zx26, anonymousClass98827), AbstractC46818KnD.A00(interfaceC11380iw19, userSession16, c7zx26, anonymousClass98827, true));
            case 36:
                C7MW c7mw31 = (C7MW) this.A02;
                C7ZX c7zx27 = c7mw31.A08;
                AnonymousClass988 anonymousClass98828 = c7mw31.A09;
                InterfaceC11380iw interfaceC11380iw20 = c7mw31.A06;
                C79Z c79z19 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z19, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.ContextualReplyCardViewHolder>");
                return AbstractC46819KnE.A00(interfaceC11380iw20, c79z19, c7zx27, anonymousClass98828);
            case 37:
                C7MW c7mw32 = (C7MW) this.A02;
                UserSession userSession17 = c7mw32.A07;
                C7ZX c7zx28 = c7mw32.A08;
                AnonymousClass988 anonymousClass98829 = c7mw32.A09;
                InterfaceC11380iw interfaceC11380iw21 = c7mw32.A06;
                C79Z c79z20 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z20, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.selfiereaction.SelfieReactionContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C14360o3.A0B(interfaceC11380iw21, 3);
                C14360o3.A0B(c79z20, 4);
                return new AbstractC1584479e(c79z20, C158907Bc.A00(c7zx28, anonymousClass98829), new C49107Lnk(interfaceC11380iw21, userSession17, c7zx28, anonymousClass98829));
            case 38:
                C7MW c7mw33 = (C7MW) this.A02;
                UserSession userSession18 = c7mw33.A07;
                Context context3 = c7mw33.A04;
                C7ZX c7zx29 = c7mw33.A08;
                AnonymousClass988 anonymousClass98830 = c7mw33.A09;
                InterfaceC11380iw interfaceC11380iw22 = c7mw33.A06;
                C79Z c79z21 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z21, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.portraitxma.viewholders.PortraitXmaContentViewHolder>");
                return C76L.A00(context3, interfaceC11380iw22, userSession18, c79z21, c7zx29, anonymousClass98830);
            case 39:
                C7MW c7mw34 = (C7MW) this.A02;
                UserSession userSession19 = c7mw34.A07;
                C7ZX c7zx30 = c7mw34.A08;
                AnonymousClass988 anonymousClass98831 = c7mw34.A09;
                C79Z c79z22 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z22, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.storesticker.StoreStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw23 = c7mw34.A06;
                C14360o3.A0B(c79z22, 3);
                C14360o3.A0B(interfaceC11380iw23, 4);
                return new AbstractC1584479e(c79z22, C158907Bc.A00(c7zx30, anonymousClass98831), new C49116Lnt(interfaceC11380iw23, userSession19, c7zx30, AbstractC167027dH.A0J(c7zx30, anonymousClass98831)));
            case 40:
                C7MW c7mw35 = (C7MW) this.A02;
                UserSession userSession20 = c7mw35.A07;
                C7ZX c7zx31 = c7mw35.A08;
                AnonymousClass988 anonymousClass98832 = c7mw35.A09;
                C79Z c79z23 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z23, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.storesticker.StoreStickerContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw24 = c7mw35.A06;
                C14360o3.A0B(c79z23, 3);
                C14360o3.A0B(interfaceC11380iw24, 4);
                return new AbstractC1584479e(c79z23, new C49116Lnt(interfaceC11380iw24, userSession20, c7zx31, AbstractC167027dH.A0J(c7zx31, anonymousClass98832)), new C79T(userSession20, c7zx31, anonymousClass98832));
            case Seq.NULL_REFNUM /* 41 */:
                C7MW c7mw36 = (C7MW) this.A02;
                UserSession userSession21 = c7mw36.A07;
                C7ZX c7zx32 = c7mw36.A08;
                AnonymousClass988 anonymousClass98833 = c7mw36.A09;
                C79Z c79z24 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z24, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw25 = c7mw36.A06;
                C14360o3.A0B(c79z24, 3);
                C14360o3.A0B(interfaceC11380iw25, 4);
                return new AbstractC1584479e(c79z24, A0Z.A00(interfaceC11380iw25, userSession21, c7zx32, anonymousClass98833), new C79T(userSession21, c7zx32, anonymousClass98833));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C7MW c7mw37 = (C7MW) this.A02;
                Context context4 = c7mw37.A04;
                UserSession userSession22 = c7mw37.A07;
                C7ZX c7zx33 = c7mw37.A08;
                AnonymousClass988 anonymousClass98834 = c7mw37.A09;
                C79Z c79z25 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z25, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw26 = c7mw37.A06;
                C14360o3.A0B(c79z25, 4);
                C14360o3.A0B(interfaceC11380iw26, 5);
                return new AbstractC1584479e(c79z25, A0Z.A00(interfaceC11380iw26, userSession22, c7zx33, anonymousClass98834), new C1586479z(context4, interfaceC11380iw26, userSession22, c7zx33, anonymousClass98834));
            case 43:
                C7MW c7mw38 = (C7MW) this.A02;
                UserSession userSession23 = c7mw38.A07;
                C7ZX c7zx34 = c7mw38.A08;
                AnonymousClass988 anonymousClass98835 = c7mw38.A09;
                C79Z c79z26 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z26, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw27 = c7mw38.A06;
                C14360o3.A0B(c79z26, 3);
                C14360o3.A0B(interfaceC11380iw27, 4);
                return new AbstractC1584479e(c79z26, A0Z.A00(interfaceC11380iw27, userSession23, c7zx34, anonymousClass98835), new C7RY(interfaceC11380iw27, userSession23, c7zx34, anonymousClass98835));
            case 44:
                C7MW c7mw39 = (C7MW) this.A02;
                UserSession userSession24 = c7mw39.A07;
                C7ZX c7zx35 = c7mw39.A08;
                AnonymousClass988 anonymousClass98836 = c7mw39.A09;
                C79Z c79z27 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z27, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw28 = c7mw39.A06;
                C14360o3.A0B(c79z27, 3);
                C14360o3.A0B(interfaceC11380iw28, 4);
                return new AbstractC1584479e(c79z27, A0Z.A00(interfaceC11380iw28, userSession24, c7zx35, anonymousClass98836), new C7T9(interfaceC11380iw28, userSession24, c7zx35, anonymousClass98836));
            case 45:
                C7MW c7mw40 = (C7MW) this.A02;
                UserSession userSession25 = c7mw40.A07;
                C7ZX c7zx36 = c7mw40.A08;
                AnonymousClass988 anonymousClass98837 = c7mw40.A09;
                C79Z c79z28 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z28, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw29 = c7mw40.A06;
                C14360o3.A0B(c79z28, 3);
                C14360o3.A0B(interfaceC11380iw29, 4);
                return new AbstractC1584479e(c79z28, A0Z.A00(interfaceC11380iw29, userSession25, c7zx36, anonymousClass98837), A0Z.A00(interfaceC11380iw29, userSession25, c7zx36, anonymousClass98837));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C7MW c7mw41 = (C7MW) this.A02;
                UserSession userSession26 = c7mw41.A07;
                C7ZX c7zx37 = c7mw41.A08;
                AnonymousClass988 anonymousClass98838 = c7mw41.A09;
                C79Z c79z29 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z29, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.storesticker.StoreStickerContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw30 = c7mw41.A06;
                C14360o3.A0B(c79z29, 3);
                C14360o3.A0B(interfaceC11380iw30, 4);
                return new AbstractC1584479e(c79z29, A0Z.A00(interfaceC11380iw30, userSession26, c7zx37, anonymousClass98838), new C49116Lnt(interfaceC11380iw30, userSession26, c7zx37, AbstractC167027dH.A0J(c7zx37, anonymousClass98838)));
            case 47:
                C7MW c7mw42 = (C7MW) this.A02;
                C7ZX c7zx38 = c7mw42.A08;
                C163337Sw c163337Sw = new C163337Sw(c7zx38, c7zx38, c7zx38, c7mw42.A09);
                C7RX c7rx12 = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c7rx12, 2);
                return new AbstractC162927Rd(c7rx12, c163337Sw);
            case 48:
                return new C49038LmQ(((C7MW) this.A02).A07, (C7IN) this.A01);
            default:
                C7MW c7mw43 = (C7MW) this.A02;
                return AbstractC22707A0d.A00(c7mw43.A07, c7mw43.A08, (C163547Tr) this.A01, c7mw43.A09);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207209Ez(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
