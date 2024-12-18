package com.instagram.direct.fragment.prompts.challenges.duration;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.C00O;
import X.C05A;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C18U;
import X.C32238EHw;
import X.C51757Mtg;
import X.C51761Mtk;
import X.EnumC33421Eps;
import X.EnumC33423Epu;
import X.FFO;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.prompts.challenges.duration.ChallengeDurationSelectorFragment$configureOptions$8", f = "ChallengeDurationSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChallengeDurationSelectorFragment$configureOptions$8 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ C32238EHw A01;
    public final /* synthetic */ IgdsListCell A02;
    public final /* synthetic */ IgdsListCell A03;
    public final /* synthetic */ IgdsListCell A04;
    public final /* synthetic */ IgdsListCell A05;
    public final /* synthetic */ IgdsListCell A06;
    public final /* synthetic */ IgdsListCell A07;
    public final /* synthetic */ IgdsListCell A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDurationSelectorFragment$configureOptions$8(C32238EHw c32238EHw, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, IgdsListCell igdsListCell3, IgdsListCell igdsListCell4, IgdsListCell igdsListCell5, IgdsListCell igdsListCell6, IgdsListCell igdsListCell7, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = igdsListCell;
        this.A08 = igdsListCell2;
        this.A02 = igdsListCell3;
        this.A07 = igdsListCell4;
        this.A01 = c32238EHw;
        this.A06 = igdsListCell5;
        this.A03 = igdsListCell6;
        this.A05 = igdsListCell7;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ChallengeDurationSelectorFragment$configureOptions$8 challengeDurationSelectorFragment$configureOptions$8 = new ChallengeDurationSelectorFragment$configureOptions$8(this.A01, this.A04, this.A08, this.A02, this.A07, this.A06, this.A03, this.A05, interfaceC23621Ds);
        challengeDurationSelectorFragment$configureOptions$8.A00 = obj;
        return challengeDurationSelectorFragment$configureOptions$8;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChallengeDurationSelectorFragment$configureOptions$8) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC33423Epu enumC33423Epu;
        String str;
        AbstractC09560e7.A00(obj);
        C51761Mtk c51761Mtk = (C51761Mtk) this.A00;
        boolean z = true;
        this.A04.setChecked(AbstractC167007dF.A1X(c51761Mtk.A02, EnumC33421Eps.A07));
        IgdsListCell igdsListCell = this.A08;
        EnumC33421Eps enumC33421Eps = (EnumC33421Eps) c51761Mtk.A02;
        igdsListCell.setChecked(AbstractC167007dF.A1X(enumC33421Eps, EnumC33421Eps.A0B));
        this.A02.setChecked(AbstractC167007dF.A1X(enumC33421Eps, EnumC33421Eps.A05));
        this.A07.setChecked(AbstractC167007dF.A1X(enumC33421Eps, EnumC33421Eps.A0A));
        C32238EHw c32238EHw = this.A01;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c32238EHw.A02), 36324247819595788L)) {
            this.A06.setChecked(AbstractC167007dF.A1X(enumC33421Eps, EnumC33421Eps.A09));
            this.A03.setChecked(AbstractC167007dF.A1X(enumC33421Eps, EnumC33421Eps.A06));
            IgdsListCell igdsListCell2 = this.A05;
            if (enumC33421Eps != EnumC33421Eps.A08) {
                z = false;
            }
            igdsListCell2.setChecked(z);
        }
        FFO ffo = c32238EHw.A00;
        if (ffo == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(enumC33421Eps, 0);
        C05A c05a = ffo.A00.A04().A00;
        do {
            value = c05a.getValue();
            C51757Mtg c51757Mtg = (C51757Mtg) value;
            enumC33423Epu = (EnumC33423Epu) c51757Mtg.A01;
            str = c51757Mtg.A02;
            AbstractC167017dG.A1P(enumC33423Epu, str);
        } while (!c05a.AIi(value, new C51757Mtg(enumC33421Eps, enumC33423Epu, str)));
        return C0eB.A00;
    }
}
