package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.LXh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48258LXh implements InterfaceC11380iw, InterfaceC11480j6 {
    public static final String __redex_internal_original_name = "BroadcastChatJoinChatPreviewViewModel$AnalyticsModuleWithChannelExtra";
    public final /* synthetic */ C32699EaQ A00;

    public C48258LXh(C32699EaQ c32699EaQ) {
        this.A00 = c32699EaQ;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        C32699EaQ c32699EaQ = this.A00;
        c11520jB.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c32699EaQ.A01());
        c11520jB.A09("is_broadcast_chat", 1);
        c11520jB.A09(AbstractC111324zv.A00(3848), 1);
        c11520jB.A09("audience_type", c32699EaQ.A00());
        c11520jB.A0A(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c32699EaQ.A03);
        c11520jB.A0A("ad_id", c32699EaQ.A02);
        return c11520jB;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(393);
    }
}
