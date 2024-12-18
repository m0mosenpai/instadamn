package com.instagram.creation.genai.themes.domain;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.B4Z;
import X.C05A;
import X.C05F;
import X.C0eB;
import X.C17s;
import X.C194848jk;
import X.C19L;
import X.C1JX;
import X.C25870BcR;
import X.C26070Bfy;
import X.C26071Bg0;
import X.C3NX;
import X.C3NY;
import X.C49496Lu9;
import X.C57171PZp;
import X.C68079V9k;
import X.EnumC27394C6x;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.themes.domain.AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1", f = "AiThemesViewModel.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C26070Bfy A02;
    public final /* synthetic */ C25870BcR A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ C19L A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1(C26070Bfy c26070Bfy, C25870BcR c25870BcR, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, C19L c19l, int i) {
        super(1, interfaceC23621Ds);
        this.A03 = c25870BcR;
        this.A02 = c26070Bfy;
        this.A05 = c19l;
        this.A04 = interfaceC16660sJ;
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C25870BcR c25870BcR = this.A03;
        return new AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1(this.A02, c25870BcR, interfaceC23621Ds, this.A04, this.A05, this.A01);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        C26071Bg0 c26071Bg0;
        Object value2;
        C26071Bg0 c26071Bg02;
        Object value3;
        C26071Bg0 c26071Bg03;
        List list;
        List A0i;
        Object obj2;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C25870BcR c25870BcR = this.A03;
            C05A c05a = c25870BcR.A0I;
            do {
                value = c05a.getValue();
                c26071Bg0 = (C26071Bg0) value;
            } while (!C26071Bg0.A02(EnumC27394C6x.A03, c26071Bg0, value, c26071Bg0.A03, c05a));
            C68079V9k c68079V9k = c25870BcR.A0B;
            C26070Bfy c26070Bfy = this.A02;
            this.A00 = 1;
            obj = AbstractC23641Du.A00(this, c68079V9k.A01.Arv(), new C57171PZp(c26070Bfy, c68079V9k, (InterfaceC23621Ds) null, 33));
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C3NY c3ny = (C3NY) obj;
        if (AnonymousClass194.A07(this.A05)) {
            if (c3ny instanceof C3NX) {
                C25870BcR c25870BcR2 = this.A03;
                AnonymousClass195 anonymousClass195 = c25870BcR2.A06;
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                C49496Lu9 c49496Lu9 = c25870BcR2.A02;
                if (c49496Lu9 != null) {
                    c49496Lu9.A00(100, C05F.A01);
                }
                C05A c05a2 = c25870BcR2.A0I;
                int i = this.A01;
                do {
                    value3 = c05a2.getValue();
                    c26071Bg03 = (C26071Bg0) value3;
                    list = c26071Bg03.A03;
                    A0i = AbstractC001800i.A0i(list, C17s.A0C(0, i));
                    obj2 = ((C3NX) c3ny).A00;
                } while (!C26071Bg0.A02(EnumC27394C6x.A06, c26071Bg03, value3, AbstractC001800i.A0S(AbstractC001800i.A0i(list, C17s.A0C(i + 1, list.size())), AbstractC001800i.A0T(obj2, A0i)), c05a2));
                Object obj3 = ((C26070Bfy) obj2).A01;
                if (obj3 != null) {
                    this.A04.invoke(obj3);
                }
            } else if (c3ny instanceof C194848jk) {
                C25870BcR c25870BcR3 = this.A03;
                AnonymousClass195 anonymousClass1952 = c25870BcR3.A06;
                if (anonymousClass1952 != null) {
                    anonymousClass1952.AGH(null);
                }
                C49496Lu9 c49496Lu92 = c25870BcR3.A02;
                if (c49496Lu92 != null) {
                    c49496Lu92.A00(-1, C05F.A0N);
                }
                C05A c05a3 = c25870BcR3.A0I;
                do {
                    value2 = c05a3.getValue();
                    c26071Bg02 = (C26071Bg0) value2;
                } while (!C26071Bg0.A02(EnumC27394C6x.A02, c26071Bg02, value2, c26071Bg02.A03, c05a3));
            } else {
                throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }
}
