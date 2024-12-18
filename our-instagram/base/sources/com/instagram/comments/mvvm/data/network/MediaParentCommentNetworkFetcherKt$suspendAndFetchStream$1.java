package com.instagram.comments.mvvm.data.network;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC71523Is;
import X.C0eB;
import X.C166087bc;
import X.C1GJ;
import X.C1JX;
import X.C206879Ds;
import X.C24531Hw;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC24551Hy;
import X.InterfaceC71543Iw;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1", f = "MediaParentCommentNetworkFetcher.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C166087bc A02;
    public final /* synthetic */ C24531Hw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1(C166087bc c166087bc, C24531Hw c24531Hw, UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c24531Hw;
        this.A07 = interfaceC16660sJ;
        this.A02 = c166087bc;
        this.A04 = userSession;
        this.A08 = z;
        this.A05 = str;
        this.A06 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C24531Hw c24531Hw = this.A03;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1 mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1 = new MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1(this.A02, c24531Hw, this.A04, this.A05, this.A06, interfaceC23621Ds, interfaceC16660sJ, this.A08);
        mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1.A01 = obj;
        return mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            final InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.A01;
            C24531Hw c24531Hw = this.A03;
            final InterfaceC16660sJ interfaceC16660sJ = this.A07;
            final C166087bc c166087bc = this.A02;
            final UserSession userSession = this.A04;
            final boolean z = this.A08;
            final String str = this.A05;
            final String str2 = this.A06;
            c24531Hw.A02(new InterfaceC24551Hy() { // from class: X.7cR
                public String A00 = "";
                public boolean A01;

                @Override // X.InterfaceC24551Hy
                public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                }

                @Override // X.InterfaceC24551Hy
                public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    EnumC166477cG enumC166477cG;
                    String str3;
                    String str4;
                    C14360o3.A0B(abstractC115105If, 1);
                    C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                    StringBuilder sb = new StringBuilder();
                    sb.append("commentFetchType = ");
                    if (c166087bc.A01 == null) {
                        enumC166477cG = EnumC166477cG.A04;
                    } else {
                        enumC166477cG = EnumC166477cG.A03;
                    }
                    sb.append(enumC166477cG);
                    if (c40781ul != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("|| Error Title: ");
                        sb2.append(c40781ul.mErrorTitle);
                        sb2.append("|| Error Type: ");
                        sb2.append(c40781ul.mErrorType);
                        sb2.append("|| Error Message: ");
                        sb2.append(c40781ul.getErrorMessage());
                        sb2.append("|| Status: ");
                        sb2.append(c40781ul.getStatus());
                        sb2.append("|| Status Code: ");
                        sb2.append(c40781ul.mStatusCode);
                        str3 = sb2.toString();
                    } else {
                        str3 = "FetchCommentPageResponse = null || Error = null";
                    }
                    sb.append(str3);
                    sb.append(" || Throwable = ");
                    Throwable A01 = abstractC115105If.A01();
                    if (A01 == null || (str4 = A01.getMessage()) == null) {
                        str4 = "null";
                    }
                    sb.append(str4);
                    C0w9.A03("CommentsFetcher#Comments Fetch Error", sb.toString());
                    interfaceC71543Iw.F8s(C168597ft.A00);
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DVR() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void Dg4() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DgK() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                @Override // X.InterfaceC24551Hy
                public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    InterfaceC71543Iw interfaceC71543Iw2 = interfaceC71543Iw;
                    interfaceC71543Iw2.F8s(new C170307ij(this.A01, this.A00));
                    interfaceC71543Iw2.AID(null);
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C168827gH c168827gH = (C168827gH) interfaceC40801un;
                    C14360o3.A0B(c168827gH, 2);
                    this.A01 = c168827gH.A0I;
                    this.A00 = c168827gH.A0C;
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C9BW c9bw;
                    C168827gH c168827gH = (C168827gH) interfaceC40801un;
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    C14360o3.A0B(c168827gH, 2);
                    interfaceC16660sJ.invoke(c168827gH);
                    C38891rO c38891rO = c168827gH.A03;
                    if (c38891rO != null) {
                        String str3 = c38891rO.A0r;
                        if (str3 != null) {
                            c166087bc.A02.add(str3);
                        }
                        boolean z2 = c168827gH.A0K;
                        java.util.Set set = c166087bc.A02;
                        c9bw = AbstractC168487fi.A00(userSession, c38891rO, str, str2, set, z, false, z2);
                    } else {
                        c9bw = null;
                    }
                    List list = c168827gH.A0D;
                    C166087bc c166087bc2 = c166087bc;
                    ArrayList<C38891rO> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        java.util.Set set2 = c166087bc2.A02;
                        String str4 = ((C38891rO) obj2).A0r;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (!set2.contains(str4)) {
                            arrayList.add(obj2);
                        }
                    }
                    UserSession userSession2 = userSession;
                    boolean z3 = z;
                    String str5 = str;
                    String str6 = str2;
                    ArrayList arrayList2 = new ArrayList();
                    for (C38891rO c38891rO2 : arrayList) {
                        String str7 = c38891rO2.A0r;
                        if (str7 != null) {
                            c166087bc2.A02.add(str7);
                        }
                        C9BW A00 = AbstractC168487fi.A00(userSession2, c38891rO2, str5, str6, c166087bc2.A02, z3, false, c168827gH.A0K);
                        if (A00 != null) {
                            arrayList2.add(A00);
                        }
                    }
                    boolean z4 = false;
                    if (c168827gH.A07 == C05F.A00) {
                        z4 = true;
                    }
                    List list2 = c168827gH.A0F;
                    boolean z5 = c168827gH.A0K;
                    Integer num = c168827gH.A08;
                    interfaceC71543Iw.F8s(new C168567fq(c9bw, c168827gH.A04, c168827gH.A05, num, null, arrayList2, list2, z4, z5, false, c168827gH.A0G));
                }
            });
            C1GJ.A06(c24531Hw, 722993640, 1, true, false);
            C206879Ds c206879Ds = new C206879Ds(c24531Hw, 21);
            this.A00 = 1;
            if (AbstractC71523Is.A00(this, c206879Ds, interfaceC71543Iw) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
