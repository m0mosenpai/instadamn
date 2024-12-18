package com.instagram.archive.data;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C156226zr;
import X.C1JX;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.archive.data.HighlightsSettingsRepository$setCardsEnabled$2", f = "HighlightsSettingsRepository.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class HighlightsSettingsRepository$setCardsEnabled$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ HighlightsSettingsRepository A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightsSettingsRepository$setCardsEnabled$2(HighlightsSettingsRepository highlightsSettingsRepository, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(1, interfaceC23621Ds);
        this.A01 = highlightsSettingsRepository;
        this.A02 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new HighlightsSettingsRepository$setCardsEnabled$2(this.A01, interfaceC23621Ds, this.A02);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((HighlightsSettingsRepository$setCardsEnabled$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A01.A01;
            Boolean valueOf = Boolean.valueOf(this.A02);
            this.A00 = 1;
            obj = C156226zr.A00(userSession, null, valueOf, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        return obj;
    }
}
