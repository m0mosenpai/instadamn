package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p001native.ContentDeliveryLibrary;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import java.io.File;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PZ8 extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public Object A01;
    public final int A02 = 2;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ8(Context context, MediaMetadataRetriever mediaMetadataRetriever, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A03 = context;
        this.A06 = str;
        this.A00 = userSession;
        this.A05 = mediaMetadataRetriever;
        this.A04 = interfaceC16620sF;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A02) {
            case 0:
                PZ8 pz8 = new PZ8((CdlProviderImpl) this.A01, this.A06, (Map) this.A04, interfaceC23621Ds, (InterfaceC16660sJ) this.A03, (Float[]) this.A05);
                pz8.A00 = obj;
                return pz8;
            case 1:
                Context context = (Context) this.A03;
                String str = this.A06;
                PZ8 pz82 = new PZ8(context, (MediaMetadataRetriever) this.A05, (UserSession) this.A00, str, interfaceC23621Ds, (InterfaceC16620sF) this.A04);
                pz82.A01 = obj;
                return pz82;
            default:
                GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) this.A05;
                return new PZ8((C50679MYx) this.A03, (C50679MYx) this.A00, (C50679MYx) this.A04, (C33091Eir) this.A01, groupLinkPreviewResponse$Success, this.A06, interfaceC23621Ds);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Object A1D;
        Integer A0i;
        Integer A0i2;
        Integer A0i3;
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                Object obj2 = this.A00;
                CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) this.A01;
                OBR obr = cdlProviderImpl.A00;
                if (obr != null) {
                    String str = this.A06;
                    Map map = (Map) this.A04;
                    Float[] fArr = (Float[]) this.A05;
                    C50365MLr c50365MLr = new C50365MLr(obj2, cdlProviderImpl, this.A03, str, 1);
                    C14360o3.A0B(str, 0);
                    AbstractC167007dF.A1D(map, 1, fArr);
                    obr.A01.A01("generate_color_ramps_start", str, null, map);
                    LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                    ContentDeliveryLibrary contentDeliveryLibrary = obr.A00;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        fArr2[i4] = fArr[i4].floatValue();
                    }
                    return Boolean.valueOf(contentDeliveryLibrary.generateColorRamp(str, map, fArr2, liveEditingRawMemoryPointerHolder, new On1(obr, liveEditingRawMemoryPointerHolder, str, map, c50365MLr)));
                }
                return null;
            case 1:
                AbstractC09560e7.A00(obj);
                File A11 = AbstractC166987dD.A11(AbstractC916948n.A0A((Context) this.A03, "mp4", System.nanoTime(), true));
                String str2 = this.A06;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A00;
                boolean z = false;
                C14360o3.A0B(abstractC12990ll, 3);
                if (str2 != null && AbstractC50633MWu.A08(abstractC12990ll, A11, str2, -1L) != null) {
                    z = true;
                } else {
                    C0f5 AEp = C18950wb.A01.AEp("MetaAIIntentsGeneratedVideoResultAdapter", 817902720);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Attempt to download failed. Could not find cache or file.");
                    AEp.report();
                }
                if (z) {
                    MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.A05;
                    mediaMetadataRetriever.setDataSource(A11.getCanonicalPath());
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    int i5 = 0;
                    if (extractMetadata != null && (A0i3 = AbstractC003100w.A0i(extractMetadata)) != null) {
                        i = A0i3.intValue();
                    } else {
                        i = 0;
                    }
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                    if (extractMetadata2 != null && (A0i2 = AbstractC003100w.A0i(extractMetadata2)) != null) {
                        i2 = A0i2.intValue();
                    } else {
                        i2 = 0;
                    }
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    if (extractMetadata3 != null && (A0i = AbstractC003100w.A0i(extractMetadata3)) != null) {
                        i3 = A0i.intValue();
                    } else {
                        i3 = 0;
                    }
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata4 != null) {
                        i5 = AbstractC25227BEk.A06(AbstractC003100w.A0i(extractMetadata4), 0);
                    }
                    Medium A03 = C8IU.A03(A11, 3, i);
                    A03.A04 = i3;
                    A03.A0B = i2;
                    A03.A07 = i5;
                    try {
                        A1D = ALv.A00.A02(mediaMetadataRetriever, i2, i3);
                    } catch (Throwable th) {
                        A1D = MSW.A1D(th);
                    }
                    if (A1D instanceof C09540e5) {
                        A1D = null;
                    }
                    Bitmap bitmap = (Bitmap) A1D;
                    if (bitmap != null) {
                        File A00 = AbstractC917048o.A00();
                        AHW.A02(bitmap, A00, true);
                        A03.A0a = A00.getCanonicalPath();
                    }
                    ((InterfaceC16620sF) this.A04).invoke(A11, A03);
                }
                return C0eB.A00;
            default:
                AbstractC09560e7.A00(obj);
                if (((GroupLinkPreviewResponse$Success) this.A05) == null || !(!(((C33091Eir) this.A01).A01.F8s(new C32798Ec2(r4)) instanceof C2QW))) {
                    C50679MYx c50679MYx = (C50679MYx) this.A03;
                    if (c50679MYx != null) {
                        C4A7 c4a7 = (C4A7) this.A01;
                        AbstractC166987dD.A1Z(new MBX(c4a7, c50679MYx.A01, c50679MYx.A00, (InterfaceC23621Ds) null, 15), c4a7.A01);
                    }
                    String str3 = this.A06;
                    if (str3 != null) {
                        C4A7 c4a72 = (C4A7) this.A01;
                        AbstractC166987dD.A1Z(new PYc(c4a72, str3, null, 30), c4a72.A01);
                    }
                    C50679MYx c50679MYx2 = (C50679MYx) this.A00;
                    if (c50679MYx2 != null) {
                        C4A7 c4a73 = (C4A7) this.A01;
                        String str4 = c50679MYx2.A00;
                        String str5 = c50679MYx2.A01;
                        C14360o3.A0B(str4, 0);
                        AbstractC166987dD.A1Z(new MBX(c4a73, str5, str4, (InterfaceC23621Ds) null, 16), c4a73.A01);
                    }
                    C50679MYx c50679MYx3 = (C50679MYx) this.A04;
                    if (c50679MYx3 != null) {
                        C4A7 c4a74 = (C4A7) this.A01;
                        AbstractC166987dD.A1Z(new PYc(c4a74, c50679MYx3.A01, null, 29), c4a74.A01);
                    }
                }
                return C0eB.A00;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ8) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ8(C50679MYx c50679MYx, C50679MYx c50679MYx2, C50679MYx c50679MYx3, C33091Eir c33091Eir, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = groupLinkPreviewResponse$Success;
        this.A03 = c50679MYx;
        this.A06 = str;
        this.A00 = c50679MYx2;
        this.A04 = c50679MYx3;
        this.A01 = c33091Eir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ8(CdlProviderImpl cdlProviderImpl, String str, Map map, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, Float[] fArr) {
        super(2, interfaceC23621Ds);
        this.A01 = cdlProviderImpl;
        this.A06 = str;
        this.A04 = map;
        this.A05 = fArr;
        this.A03 = interfaceC16660sJ;
    }
}
