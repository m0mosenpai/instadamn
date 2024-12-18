package com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C3Q1;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.zero.main.IgZeroMain;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1", f = "BKBloksActionZeroTriggerHeadersPingImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(this.A01, (InterfaceC23621Ds) obj2).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        IgZeroMain igZeroMain;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            String str = this.A01;
            this.A00 = 1;
            if (C3Q1.A00 != null && (igZeroMain = IgZeroMain.A09) != null) {
                obj = igZeroMain.A05(str, this);
            } else {
                obj = null;
            }
            if (obj == c1jx) {
                return c1jx;
            }
        }
        return obj;
    }
}
