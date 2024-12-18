package X;

import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataCallback;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.google.common.collect.ImmutableList;

/* loaded from: classes4.dex */
public final class AY2 implements InterfaceC48192Ji {
    public final /* synthetic */ SparkVisionMetadataCallback A00;
    public final /* synthetic */ SparkVisionMetadataDownloader A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public AY2(SparkVisionMetadataCallback sparkVisionMetadataCallback, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = sparkVisionMetadataCallback;
        this.A01 = sparkVisionMetadataDownloader;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        ImmutableList immutableList;
        SparkVisionMetadataResponse parseResults;
        C209479Oh c209479Oh;
        try {
            SparkVisionMetadataCallback sparkVisionMetadataCallback = this.A00;
            SparkVisionMetadataDownloader sparkVisionMetadataDownloader = this.A01;
            C209469Og c209469Og = (C209469Og) anonymousClass436.Bos();
            if (c209469Og != null && (c209479Oh = (C209479Oh) c209469Og.A03(C209479Oh.class, "aim_model_batched_manifest(client_capability_metadata:$client_capability_metadata,model_request_metadatas:$model_request_metadatas)", 543548346)) != null) {
                immutableList = c209479Oh.A06(C209489Oi.class, "models", 557494686);
            } else {
                immutableList = null;
            }
            C14360o3.A0C(immutableList, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.facebook.cameracore.ardelivery.graphql.NativeMLModelBatchedQueryResponse.AimModelBatchedManifest.Models>");
            parseResults = sparkVisionMetadataDownloader.parseResults(immutableList);
            sparkVisionMetadataCallback.onSuccess(parseResults);
        } catch (Exception e) {
            this.A02.invoke(e);
        }
    }
}
