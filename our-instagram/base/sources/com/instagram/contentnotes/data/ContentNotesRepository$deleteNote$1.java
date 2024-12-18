package com.instagram.contentnotes.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C27105BxU;
import X.C4F0;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1", f = "ContentNotesRepository.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ContentNotesRepository$deleteNote$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C4F0 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentNotesRepository$deleteNote$1(C4F0 c4f0, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = c4f0;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A09 = str5;
        this.A04 = str6;
        this.A02 = num;
        this.A05 = str7;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ContentNotesRepository$deleteNote$1(this.A01, this.A02, this.A07, this.A08, this.A03, this.A06, this.A09, this.A04, this.A05, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C27105BxU c27105BxU = new C27105BxU(this.A01.A00, this.A02, this.A07, this.A08, this.A03, this.A06, this.A09, this.A04, this.A05);
            this.A00 = 1;
            if (c27105BxU.A00(this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentNotesRepository$deleteNote$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
