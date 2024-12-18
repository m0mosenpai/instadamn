package X;

import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public abstract class Ou1 implements InterfaceC41501vz {
    public final String A00;

    public Ou1(String str) {
        this.A00 = str;
        if (str != null && str.length() != 0) {
        } else {
            throw AbstractC31172DnG.A0u();
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C54825OLj c54825OLj;
        C55058OaD c55058OaD;
        EnumC53187Nfj enumC53187Nfj;
        C54825OLj A00;
        EnumC53187Nfj enumC53187Nfj2;
        int A03 = C0f9.A03(1849254559);
        AbstractC56001OtY abstractC56001OtY = (AbstractC56001OtY) obj;
        int A0N = AbstractC167017dG.A0N(abstractC56001OtY, -983374954);
        if (C14360o3.A0K(abstractC56001OtY.A00, this.A00)) {
            if (this instanceof NYR) {
                NYR nyr = (NYR) this;
                switch (nyr.A00) {
                    case 0:
                        C55058OaD c55058OaD2 = ((OFE) nyr.A01).A03;
                        C55058OaD.A01(c55058OaD2, c55058OaD2.A01, EnumC53187Nfj.A07);
                        break;
                    case 1:
                        NYG nyg = (NYG) abstractC56001OtY;
                        C14360o3.A0B(nyg, 0);
                        String str = nyg.A01;
                        Integer num = nyg.A00;
                        if (num != null) {
                            num.intValue();
                        }
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                c55058OaD = ((OFE) nyr.A01).A03;
                                enumC53187Nfj = EnumC53187Nfj.A0A;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            c55058OaD = ((OFE) nyr.A01).A03;
                            enumC53187Nfj = EnumC53187Nfj.A02;
                        }
                        if (str != null) {
                            c55058OaD.A02.get(str);
                            A00 = C55058OaD.A00(c55058OaD, str);
                            break;
                        }
                        break;
                    case 2:
                        NYH nyh = (NYH) abstractC56001OtY;
                        C14360o3.A0B(nyh, 0);
                        String str2 = nyh.A01;
                        Integer num2 = nyh.A00;
                        if (num2 != null) {
                            num2.intValue();
                        }
                        int intValue2 = num2.intValue();
                        if (intValue2 != 0) {
                            if (intValue2 != 1) {
                                if (intValue2 == 2) {
                                    c55058OaD = ((OFE) nyr.A01).A03;
                                    enumC53187Nfj = EnumC53187Nfj.A02;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                c55058OaD = ((OFE) nyr.A01).A03;
                                enumC53187Nfj = EnumC53187Nfj.A05;
                            }
                            if (str2 != null) {
                                c55058OaD.A02.get(str2);
                                A00 = C55058OaD.A00(c55058OaD, str2);
                                break;
                            }
                        } else {
                            C55058OaD c55058OaD3 = ((OFE) nyr.A01).A03;
                            try {
                                if (str2 != null) {
                                    c54825OLj = C55058OaD.A00(c55058OaD3, str2);
                                } else {
                                    c54825OLj = (C54825OLj) c55058OaD3.A02(new HashSet(Arrays.asList(EnumC53187Nfj.A04, EnumC53187Nfj.A08)), false).iterator().next();
                                }
                                if (c54825OLj != null) {
                                    C55058OaD.A01(c55058OaD3, c54825OLj, EnumC53187Nfj.A03);
                                    break;
                                }
                            } catch (NoSuchElementException e) {
                                C0K8.A0P("ConferenceState", "onMediaStreamAdded:  Unknown participant %s", str2, e);
                                C0w9.A06("ConferenceState", AnonymousClass001.A0R("Media stream added for missing participant: ", str2), e);
                                break;
                            }
                        }
                        break;
                    default:
                        NYI nyi = (NYI) abstractC56001OtY;
                        C14360o3.A0B(nyi, 0);
                        NYN nyn = nyi.A00;
                        int i = nyn.A00;
                        OFE ofe = (OFE) nyr.A01;
                        if (i >= ofe.A00) {
                            C55058OaD c55058OaD4 = ofe.A03;
                            String str3 = nyi.A01;
                            Integer num3 = nyn.A01;
                            C54825OLj A002 = C55058OaD.A00(c55058OaD4, str3);
                            switch (num3.intValue()) {
                                case 1:
                                case 5:
                                    enumC53187Nfj2 = EnumC53187Nfj.A05;
                                    break;
                                case 2:
                                case 4:
                                case 10:
                                case 11:
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    enumC53187Nfj2 = EnumC53187Nfj.A0C;
                                    break;
                                case 3:
                                    enumC53187Nfj2 = EnumC53187Nfj.A09;
                                    break;
                                case 6:
                                case 7:
                                    enumC53187Nfj2 = EnumC53187Nfj.A08;
                                    break;
                                case 8:
                                    enumC53187Nfj2 = EnumC53187Nfj.A04;
                                    break;
                                case 9:
                                    enumC53187Nfj2 = EnumC53187Nfj.A03;
                                    break;
                                default:
                                    enumC53187Nfj2 = EnumC53187Nfj.A0B;
                                    break;
                            }
                            C55058OaD.A01(c55058OaD4, A002, enumC53187Nfj2);
                            ofe.A00 = i;
                            break;
                        }
                        break;
                }
                C55058OaD.A01(c55058OaD, A00, enumC53187Nfj);
            } else if (this instanceof NYD) {
                IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository = ((NYD) this).A00;
                igLiveViewerJoinFlowRepository.A05.Egh(NYY.A00);
                igLiveViewerJoinFlowRepository.A04();
            } else {
                NYS nys = (NYS) this;
                NYJ nyj = (NYJ) abstractC56001OtY;
                C14360o3.A0B(nyj, 0);
                IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository2 = nys.A00;
                igLiveViewerJoinFlowRepository2.A05.Egh(new NYX(MSX.A0Y(AbstractC31176DnK.A1b(igLiveViewerJoinFlowRepository2.A04) ? 1 : 0), nys.A01, nyj.A01, nyj.A00));
            }
        }
        C0f9.A0A(36246512, A0N);
        C0f9.A0A(-1805429480, A03);
    }
}
