package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class DH5 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH5(AbstractC44190Jft abstractC44190Jft, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = abstractC44190Jft;
        if (25 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public static IllegalStateException A00(DH5 dh5) {
        return new IllegalStateException(AnonymousClass001.A0R("Argument not found for ", dh5.A03));
    }

    public static InterfaceC09390do A01(Object obj, String str, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new DH5(obj, str, str, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        String str;
        String str2;
        Object A0n;
        switch (this.A00) {
            case 0:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D79((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 1:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7A((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 2:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7B((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 3:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7D((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 4:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7E((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 5:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7F((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 6:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7G((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 7:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7H((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 8:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7I((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 9:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7J((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 10:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7K((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 11:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7P((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7Q((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7R((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 14:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7S((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case Process.SIGTERM /* 15 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7T((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 16:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7U((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 17:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7V((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 18:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7W((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case Process.SIGSTOP /* 19 */:
                C163907Ve c163907Ve = (C163907Ve) this.A01;
                String str3 = this.A03;
                String queryParameter = AbstractC25227BEk.A0B(this.A02).getQueryParameter(AbstractC111324zv.A00(807));
                if (queryParameter != null) {
                    AnonymousClass983 anonymousClass983 = c163907Ve.A00;
                    Context context = anonymousClass983.A02;
                    if (context == null) {
                        str2 = "context";
                    } else {
                        Context applicationContext = context.getApplicationContext();
                        C1ON A0e = AbstractC25227BEk.A0e(AbstractC47995LLh.A03(anonymousClass983.A10, JRE.A01(anonymousClass983.A0b), new MessageIdentifier(queryParameter, null), C05F.A01, null, AbstractC166987dD.A1J(str3)), C32207EDg.class, C34793FUv.class);
                        A0e.A00 = new N9J(applicationContext, 0);
                        C1GJ.A03(A0e);
                        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = anonymousClass983.A0D;
                        if (directAggregatedMediaViewerController == null) {
                            str2 = "directAggregatedMediaViewerController";
                        } else {
                            directAggregatedMediaViewerController.A0l();
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return C0eB.A00;
            case 20:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29687D7d((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 21:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29688D7e((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 22:
                C44768Jrp c44768Jrp = (C44768Jrp) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c44768Jrp.A0B.DVz(this.A02, this.A03);
                return C0eB.A00;
            case 23:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29692D7i((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 24:
                String str4 = this.A03;
                if (str4 != null) {
                    EOK eok = (EOK) this.A01;
                    String str5 = this.A02;
                    C36297Fzr c36297Fzr = eok.A02;
                    if (c36297Fzr == null) {
                        str2 = "dailyPromptsLogger";
                    } else {
                        String str6 = eok.A0C;
                        if (str6 == null) {
                            str2 = "threadId";
                        } else {
                            DirectThreadKey directThreadKey = eok.A08;
                            if (directThreadKey == null) {
                                str2 = "threadKey";
                            } else {
                                String str7 = directThreadKey.A01;
                                int i2 = eok.A00;
                                String str8 = eok.A0D;
                                if (str8 == null) {
                                    str2 = "userType";
                                } else {
                                    if (eok.A0H) {
                                        str = "ACTIVE";
                                    } else {
                                        str = "ENDED";
                                    }
                                    C36297Fzr.A02(c36297Fzr, str6, str7, "daily_prompt_response_reported", "tap", MSV.A00(1546), AbstractC43591JPw.A00(330), AbstractC25232BEp.A1F("daily_prompt_submission_id", str5, AbstractC166987dD.A1L("daily_prompt_status", str), AbstractC166987dD.A1L("user_type", str8)), i2);
                                    EOK.A03(eok, VG2.A0T, str4, str5);
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return C0eB.A00;
            case 25:
                AbstractC44190Jft abstractC44190Jft = (AbstractC44190Jft) this.A01;
                abstractC44190Jft.A01.flowAnnotate(abstractC44190Jft.A00, this.A02, this.A03);
                return C0eB.A00;
            case 26:
                AbstractC44190Jft abstractC44190Jft2 = (AbstractC44190Jft) this.A01;
                abstractC44190Jft2.A01.flowEndFail(abstractC44190Jft2.A00, this.A03, this.A02);
                abstractC44190Jft2.A00 = 0L;
                return C0eB.A00;
            case 27:
                AbstractC44190Jft abstractC44190Jft3 = (AbstractC44190Jft) this.A01;
                abstractC44190Jft3.A01.flowMarkPoint(abstractC44190Jft3.A00, this.A03, this.A02);
                return C0eB.A00;
            case 28:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29694D7k((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29695D7l((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 30:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7m((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 31:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7n((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 32:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D7o((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 33:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29696D7p((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 34:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29697D7q((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 35:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29698D7r((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 36:
                super/*X.1CN*/.A0p(this.A03, this.A02);
                return C0eB.A00;
            case 37:
                super/*X.1CN*/.A0q(this.A03, this.A02);
                return C0eB.A00;
            case 38:
                HYD hyd = (HYD) this.A01;
                return new C51079Mhb(hyd.A00, hyd.A01, this.A03, this.A02, AbstractC167027dH.A01(hyd.A02));
            case 39:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29701D7u((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 40:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29702D7v((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case Seq.NULL_REFNUM /* 41 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29703D7w((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29704D7x((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 43:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29705D7y((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 44:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29706D7z((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 45:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D80((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D81((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            case 47:
                C25665BWb c25665BWb = (C25665BWb) this.A01;
                String str9 = this.A03;
                String str10 = this.A02;
                InterfaceC16620sF interfaceC16620sF = c25665BWb.A04;
                if (interfaceC16620sF != null) {
                    interfaceC16620sF.invoke(str9, str10);
                }
                return C0eB.A00;
            case 48:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D83((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
            default:
                A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D84((Fragment) this.A01, this.A02));
                if (A0n == null) {
                    throw A00(this);
                }
                return A0n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH5(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
