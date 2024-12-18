package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes11.dex */
public final class V9D extends C17T implements XGL {
    public User A00;

    @Override // X.XGL
    public final AiAgentMetadataDict AaZ() {
        return (AiAgentMetadataDict) A05(-1735160800, ImmutablePandoAiAgentMetadataDict.class);
    }

    @Override // X.XGL
    public final ChatStickerChannelType AnL() {
        return (ChatStickerChannelType) A0N(1620118465, X61.A00);
    }

    @Override // X.XGL
    public final StoryJoinChatStatus BSG() {
        return (StoryJoinChatStatus) A0N(-1377763017, X62.A00);
    }

    @Override // X.XGL
    public final XGG BbV() {
        return (XGG) A05(549607417, C68065V8v.class);
    }

    @Override // X.XGL
    public final User BtH() {
        return this.A00;
    }

    @Override // X.XGL
    public final List ByV() {
        return A08(-1766928858, C68063V8t.class);
    }

    @Override // X.XGL
    public final ChatStickerStickerType C0m() {
        return (ChatStickerStickerType) A0N(-2030994180, X63.A00);
    }

    @Override // X.XGL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VW3.A00(this), this);
    }

    @Override // X.XGL
    public final Integer AYq() {
        return getOptionalIntValueByHashCode(176121795);
    }

    @Override // X.XGL
    public final String Aag() {
        return A0i(-922087784);
    }

    @Override // X.XGL
    public final Integer Ada() {
        return getOptionalIntValueByHashCode(-2015362923);
    }

    @Override // X.XGL
    public final Integer AqM() {
        return getOptionalIntValueByHashCode(-2056597344);
    }

    @Override // X.XGL
    public final String Aw9() {
        return A0i(1169975446);
    }

    @Override // X.XGL
    public final Long Azr() {
        return A0L(1231504520);
    }

    @Override // X.XGL
    public final String B2R() {
        return A0i(-799136893);
    }

    @Override // X.XGL
    public final String BAX() {
        return A0i(1107859144);
    }

    @Override // X.XGL
    public final String BK5() {
        return A0i(-2141481382);
    }

    @Override // X.XGL
    public final Integer BSC() {
        return getOptionalIntValueByHashCode(-59350230);
    }

    @Override // X.XGL
    public final String BuE() {
        return A0i(-270906245);
    }

    @Override // X.XGL
    public final String C1J() {
        return A0j(-970008040);
    }

    @Override // X.XGL
    public final String C7I() {
        return A0j(-1562235024);
    }

    @Override // X.XGL
    public final String C7J() {
        return A0j(-277885525);
    }

    @Override // X.XGL
    public final Boolean CRu() {
        return getOptionalBooleanValueByHashCode(1085391444);
    }

    @Override // X.XGL
    public final Boolean CSu() {
        return getOptionalBooleanValueByHashCode(1832509061);
    }

    @Override // X.XGL
    public final XGL EBz(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, 870128760);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    @Override // X.XGL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C66645URj F6m(X.C1DY r30) {
        /*
            r29 = this;
            r1 = 176121795(0xa7f67c3, float:1.2297319E-32)
            r0 = r29
            java.lang.Integer r13 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.api.schemas.AiAgentMetadataDict r1 = r0.AaZ()
            r3 = 0
            if (r1 == 0) goto Lbd
            com.instagram.api.schemas.AiAgentMetadataDictImpl r5 = r1.Eqp()
        L14:
            r1 = -922087784(0xffffffffc90a0e98, float:-565481.5)
            java.lang.String r18 = r0.A0i(r1)
            r1 = -2015362923(0xffffffff87e00095, float:-3.3704116E-34)
            java.lang.Integer r14 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.reels.chat.model.ChatStickerChannelType r8 = r0.AnL()
            r1 = -2056597344(0xffffffff856ad0a0, float:-1.10409455E-35)
            java.lang.Integer r15 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1169975446(0x45bc6896, float:6029.073)
            java.lang.String r19 = r0.A0i(r1)
            r1 = 1231504520(0x49674488, float:947272.5)
            java.lang.Long r17 = r0.A0L(r1)
            r1 = -799136893(0xffffffffd05e2383, float:-1.4907477E10)
            java.lang.String r20 = r0.A0i(r1)
            r1 = 1107859144(0x420896c8, float:34.147247)
            java.lang.String r21 = r0.A0i(r1)
            r1 = 1085391444(0x40b1c254, float:5.5549717)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1832509061(0x6d39de85, float:3.5952335E27)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -2141481382(0xffffffff805b965a, float:-8.410966E-39)
            java.lang.String r22 = r0.A0i(r1)
            r1 = -59350230(0xfffffffffc76632a, float:-5.1172653E36)
            java.lang.Integer r16 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.api.schemas.StoryJoinChatStatus r7 = r0.BSG()
            X.XGG r1 = r0.BbV()
            if (r1 == 0) goto Lbb
            X.URK r6 = r1.F0B()
        L73:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r2 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = 870128760(0x33dd1c78, float:1.0296293E-7)
            com.facebook.pando.TreeJNI r1 = r0.A05(r1, r2)
            com.instagram.user.model.ImmutablePandoUserDict r1 = (com.instagram.user.model.ImmutablePandoUserDict) r1
            if (r1 == 0) goto Lb9
            android.os.Parcelable$Creator r2 = com.instagram.user.model.User.CREATOR
            r2 = r30
            com.instagram.user.model.User r1 = X.AbstractC38851rI.A01(r2, r1)
            if (r1 == 0) goto Lb9
            X.17M r10 = r2.A00(r1)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
        L90:
            r1 = -270906245(0xffffffffefda4c7b, float:-1.3512038E29)
            java.lang.String r23 = r0.A0i(r1)
            java.util.List r1 = r0.ByV()
            if (r1 == 0) goto Lc0
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r1)
            java.util.Iterator r2 = r1.iterator()
        La5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r2.next()
            X.XFz r1 = (X.InterfaceC72037XFz) r1
            X.URI r1 = r1.Ezg()
            r3.add(r1)
            goto La5
        Lb9:
            r10 = r3
            goto L90
        Lbb:
            r6 = r3
            goto L73
        Lbd:
            r5 = r3
            goto L14
        Lc0:
            com.instagram.reels.chat.model.ChatStickerStickerType r9 = r0.C0m()
            r1 = -970008040(0xffffffffc62eda18, float:-11190.523)
            java.lang.String r24 = r0.A0j(r1)
            r1 = -1562235024(0xffffffffa2e22f70, float:-6.130765E-18)
            java.lang.String r25 = r0.A0j(r1)
            r1 = -277885525(0xffffffffef6fcdab, float:-7.4215555E28)
            java.lang.String r26 = r0.A0j(r1)
            java.lang.String r27 = r0.A0Y()
            X.URj r4 = new X.URj
            r28 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9D.F6m(X.1DY):X.URj");
    }

    @Override // X.XGL
    public final C66645URj F6n(C1DV c1dv) {
        return F6m(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.XGL
    public final String getTitle() {
        return A0Y();
    }
}
