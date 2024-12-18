package com.instagram.feed.ui.text.linkifiedtext;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C7Q2;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.ui.text.linkifiedtext.LinkExtractor$extractEmailAndAddressesAsync$1", f = "LinkExtractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class LinkExtractor$extractEmailAndAddressesAsync$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C7Q2 A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkExtractor$extractEmailAndAddressesAsync$1(Context context, C7Q2 c7q2, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A02 = str;
        this.A00 = context;
        this.A01 = c7q2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new LinkExtractor$extractEmailAndAddressesAsync$1(this.A00, this.A01, this.A02, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LinkExtractor$extractEmailAndAddressesAsync$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
    
        if (r2 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bf, code lost:
    
        if (r2 != false) goto L55;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.ui.text.linkifiedtext.LinkExtractor$extractEmailAndAddressesAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
