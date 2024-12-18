package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import com.instagram.zero.main.IgZeroMain;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.promptsheet.service.PromptSheetAINetworkService;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import com.meta.metaai.shared.nux.data.MetaAINuxRepository;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import com.meta.metaai.writewithai.service.WriteWithAINetworkService;

/* renamed from: X.D3m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29631D3m extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 1:
            case 17:
            case 32:
            case 33:
            case 35:
                A02(obj, this);
                return ((C25588BTb) this.A01).emit(null, this);
            case 2:
                A01(obj, this);
                return ((IGZeroHeadersStorage) this.A02).A05(this);
            case 3:
                A01(obj, this);
                return ((IGZeroHeadersStorage) this.A02).A06(this);
            case 4:
                A01(obj, this);
                return ((IgZeroMain) this.A02).A03(null, this);
            case 5:
                A01(obj, this);
                return ((IgZeroMain) this.A02).A04(null, this);
            case 6:
                A01(obj, this);
                return IgZeroMain.A01((IgZeroMain) this.A02, this);
            case 7:
                A01(obj, this);
                return ((C50536MSp) this.A02).A01(this, null);
            case 8:
            case 16:
                A02(obj, this);
                return ((BU4) this.A01).emit(null, this);
            case 9:
                A01(obj, this);
                return ((ImagineGenerationImageRepository) this.A02).A01(null, null, null, this);
            case 10:
                A01(obj, this);
                return ((MEmuDataRepository) this.A02).A01(null, null, null, this, false, false);
            case 11:
                A01(obj, this);
                return ((MEmuDataRepository) this.A02).A00(null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((MEmuNetworkService) this.A02).A03(this, null);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((MEmuNetworkService) this.A02).A01(null, this);
            case 14:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A08(null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A09(null, this);
            case 18:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A0A(null, this);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A07(null, this);
            case 20:
                A01(obj, this);
                return ((PromptSheetAINetworkService) this.A02).A00(null, this);
            case 21:
                A01(obj, this);
                return ((FeedbackRepository) this.A02).A00(null, null, null, this);
            case 22:
                A01(obj, this);
                return ((MetaAIFeedbackNetworkService) this.A02).A00(null, null, null, null, null, this);
            case 23:
                A01(obj, this);
                return ((MetaAINuxRepository) this.A02).A01(null, this);
            case 24:
                A01(obj, this);
                return ((MetaAINuxNetworkService) this.A02).A01(null, this);
            case 25:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A02).A04(null, this);
            case 26:
            case 27:
                A02(obj, this);
                return ((BTR) this.A01).emit(null, this);
            case 28:
                A01(obj, this);
                return ((WriteWithAINetworkService) this.A02).A03(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return ((WriteWithAINetworkService) this.A02).A02(null, null, null, this);
            case 30:
            case 31:
            case 37:
                A02(obj, this);
                return ((D3A) this.A01).emit(null, this);
            case 34:
                A02(obj, this);
                return ((J6M) this.A01).emit(null, this);
            case 36:
                A01(obj, this);
                return C55214Oeb.A05(null, null, (C55214Oeb) this.A02, this);
            case 38:
                int i = this.A00;
                if (i != 0) {
                    if (i == 1) {
                        this.A00 = 2;
                        AbstractC09560e7.A00(obj);
                        return obj;
                    }
                    throw AbstractC166987dD.A14("This coroutine had already completed");
                }
                this.A00 = 1;
                AbstractC09560e7.A00(obj);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                C14360o3.A0C(interfaceC16620sF, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                C15500q5.A06(interfaceC16620sF, 2);
                return interfaceC16620sF.invoke(this.A01, this);
            case 39:
                A02(obj, this);
                return AbstractC918549n.A01(null, this);
            default:
                A02(obj, this);
                return AbstractC54920OQv.A00(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29631D3m(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = i;
    }

    public static C29631D3m A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new C29631D3m(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, C29631D3m c29631D3m) {
        c29631D3m.A01 = obj;
        c29631D3m.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, C29631D3m c29631D3m) {
        c29631D3m.A02 = obj;
        c29631D3m.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof C29631D3m) && ((C29631D3m) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29631D3m(Object obj, InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        super(interfaceC23621Ds, c12w);
        this.A03 = 38;
        this.A02 = interfaceC16620sF;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29631D3m(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29631D3m(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
