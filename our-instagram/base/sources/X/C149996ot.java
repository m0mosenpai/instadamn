package X;

import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset.ChipsetInfoUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149996ot implements ARModelMetadataDownloader {
    public final AbstractC150536q2 A00;
    public final ChipsetInfoUtil A01;
    public final AbstractC12990ll A02;
    public final InterfaceC149916ok A05;
    public final C149946on A06;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());

    public C149996ot(InterfaceC149916ok interfaceC149916ok, C149946on c149946on, ChipsetInfoUtil chipsetInfoUtil, AbstractC12990ll abstractC12990ll) {
        this.A02 = abstractC12990ll;
        this.A06 = c149946on;
        this.A00 = C150526q1.A00(abstractC12990ll);
        this.A05 = interfaceC149916ok;
        this.A01 = chipsetInfoUtil;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x018d A[Catch: all -> 0x0198, TryCatch #2 {, blocks: (B:58:0x0132, B:60:0x013c, B:62:0x0142, B:63:0x014c, B:64:0x014f, B:70:0x0151, B:74:0x0167, B:76:0x016d, B:79:0x0180, B:81:0x018d, B:84:0x0178), top: B:57:0x0132, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.SLV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void downloadModelMetadata(java.util.List r13, X.C1819185b r14, X.X93 r15) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149996ot.downloadModelMetadata(java.util.List, X.85b, X.X93):void");
    }
}
