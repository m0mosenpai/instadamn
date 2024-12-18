package com.instagram.debug.devoptions.section.xme;

import X.AbstractC06930Yk;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25230BEn;
import X.AbstractC53758NqA;
import X.AbstractC55147OdA;
import X.C0K8;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.OXi;
import X.WDI;
import X.X9U;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$writeExifCommentField$1", f = "WearableMediaDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class WearableMediaDownloadManager$writeExifCommentField$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ String $commentText;
    public final /* synthetic */ ExecutorService $executorService;
    public final /* synthetic */ File $resultFile;
    public final /* synthetic */ MediaMetadataRetriever $retriever;
    public final /* synthetic */ X9U $tempFileProvider;
    public int label;
    public final /* synthetic */ WearableMediaDownloadManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearableMediaDownloadManager$writeExifCommentField$1(MediaMetadataRetriever mediaMetadataRetriever, File file, WearableMediaDownloadManager wearableMediaDownloadManager, String str, ExecutorService executorService, X9U x9u, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.$retriever = mediaMetadataRetriever;
        this.$resultFile = file;
        this.this$0 = wearableMediaDownloadManager;
        this.$commentText = str;
        this.$executorService = executorService;
        this.$tempFileProvider = x9u;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new WearableMediaDownloadManager$writeExifCommentField$1(this.$retriever, this.$resultFile, this.this$0, this.$commentText, this.$executorService, this.$tempFileProvider, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return ((WearableMediaDownloadManager$writeExifCommentField$1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            try {
                this.$retriever.setDataSource(this.$resultFile.getCanonicalPath());
                int parseInt = Integer.parseInt(this.$retriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(this.$retriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(this.$retriever.extractMetadata(9));
                this.$retriever.release();
                Context context = this.this$0.context;
                File file = this.$resultFile;
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, this.$commentText));
                C14360o3.A0B(file, 1);
                WDI A00 = AbstractC53758NqA.A00(context, file, true);
                if (A00 == null) {
                    A00 = null;
                } else {
                    AbstractC55147OdA.A03(A00, null, A07, parseInt, parseInt2, true);
                }
                Context context2 = this.this$0.context;
                ExecutorService executorService = this.$executorService;
                this.this$0.copyFile(OXi.A01(context2, null, A00, this.$tempFileProvider, null, this.$resultFile, executorService, 0, parseInt3, 1, true, false, false, false), this.$resultFile);
            } catch (IllegalArgumentException e) {
                C0K8.A0F(WearableMediaDownloadManager.TAG, "Error with MediaMetadataRetriever", e);
            }
            return C0eB.A00;
        }
        throw AbstractC166987dD.A13();
    }
}
