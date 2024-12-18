package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.user.model.User;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;

/* renamed from: X.DHo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29926DHo extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29926DHo(Object obj, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                C2VK c2vk = (C2VK) obj;
                C14360o3.A0B(c2vk, 0);
                c2vk.FCI((C125975mo) this.A01, this.A03, this.A02, this.A04);
                break;
            case 1:
                C2VK c2vk2 = (C2VK) obj;
                C14360o3.A0B(c2vk2, 0);
                c2vk2.FCK((C125975mo) this.A01, this.A03, this.A02, this.A04);
                break;
            case 2:
                InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) obj;
                C14360o3.A0B(interfaceC38371qR, 0);
                C25814BbV c25814BbV = (C25814BbV) this.A01;
                MediaCommentListRepository mediaCommentListRepository = c25814BbV.A0A;
                C166137bh A0s = AbstractC25228BEl.A0s(mediaCommentListRepository);
                String str = this.A03;
                String str2 = this.A02;
                C167297di A01 = AbstractC166327c1.A01(A0s, str, str2);
                if (A01 != null) {
                    boolean z = this.A04;
                    int i5 = -1;
                    C166007bS c166007bS = c25814BbV.A0C;
                    String id = A01.A0C.getId();
                    C26025BfE c26025BfE = c25814BbV.A08;
                    Integer num = c26025BfE.A04;
                    if (!z) {
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            i3 = -1;
                        }
                        Integer num2 = c26025BfE.A06;
                        if (num2 != null) {
                            i4 = num2.intValue();
                        } else {
                            i4 = -1;
                        }
                        c166007bS.A07(interfaceC38371qR, id, str, str2, i3, i4);
                    } else {
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = -1;
                        }
                        Integer num3 = c26025BfE.A06;
                        if (num3 != null) {
                            i2 = num3.intValue();
                        } else {
                            i2 = -1;
                        }
                        c166007bS.A08(interfaceC38371qR, id, str, str2, i, i2);
                    }
                    Integer num4 = A01.A0G;
                    if (interfaceC38371qR.BQN().A6F() && num4 != null) {
                        boolean z2 = A01.A0S;
                        if (!z2) {
                            i5 = 1;
                        }
                        C38321qM BQN = interfaceC38371qR.BQN();
                        String str3 = A01.A0K;
                        AbstractC50567MTy.A05(BQN, str3, !z2);
                        AbstractC50567MTy.A04(interfaceC38371qR.BQN(), str3, num4.intValue() + i5);
                    }
                }
                boolean z3 = this.A04;
                String str4 = null;
                String A18 = AbstractC25228BEl.A18(AbstractC08690cX.A00(c25814BbV.A0E));
                User A14 = AbstractC25226BEj.A14(interfaceC38371qR.BQN());
                if (A14 != null) {
                    str4 = A14.getId();
                }
                mediaCommentListRepository.A0I(interfaceC38371qR, str, str2, z3, C14360o3.A0K(A18, str4));
                break;
            default:
                C14360o3.A0B(obj, 0);
                C27333C4o c27333C4o = (C27333C4o) this.A01;
                c27333C4o.A0I.invoke(obj);
                if (obj instanceof C27325C4g) {
                    C25812BbT c25812BbT = c27333C4o.A01;
                    if (c25812BbT == null) {
                        C14360o3.A0F("viewModel");
                        throw C00O.createAndThrow();
                    }
                    String str5 = this.A03;
                    String str6 = this.A02;
                    boolean z4 = this.A04;
                    C4A c4a = C4A.A00;
                    C25812BbT.A03(c25812BbT, c4a);
                    ImagineGenerationImageRepository imagineGenerationImageRepository = c25812BbT.A0G;
                    imagineGenerationImageRepository.A00 = true;
                    if (z4) {
                        C25812BbT.A03(c25812BbT, c4a);
                    }
                    if (c25812BbT.A0I.A0D) {
                        imagineGenerationImageRepository.A0A.clear();
                        imagineGenerationImageRepository.A09.clear();
                    }
                    if (str5 != null) {
                        if (!C25812BbT.A08(c25812BbT, str5)) {
                            str5 = AnonymousClass001.A0R("me ", str5);
                        }
                        C25812BbT.A05(c25812BbT, null, null, str5, str6);
                    } else {
                        if (!AbstractC166987dD.A1b(imagineGenerationImageRepository.A0A)) {
                            D51.A02(c25812BbT, AbstractC141776au.A00(c25812BbT), 12);
                        }
                        C25812BbT.A02(c25812BbT, new C27318C3z(c25812BbT.A05), false);
                    }
                }
                c27333C4o.A0A.A03.A0S();
                break;
        }
        return C0eB.A00;
    }
}
