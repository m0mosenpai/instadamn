package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes8.dex */
public final class MI1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ EnumC33519Ers A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI1(EnumC33519Ers enumC33519Ers, String str, int i, int i2) {
        super(1);
        this.A00 = i;
        this.A02 = enumC33519Ers;
        this.A01 = i2;
        this.A03 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25531Mh c25531Mh = (C25531Mh) obj;
        C14360o3.A0B(c25531Mh, 0);
        c25531Mh.A0X(this.A00);
        c25531Mh.A0M(this.A02, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        c25531Mh.A0O("is_e2ee", false);
        c25531Mh.A0Y(this.A01);
        c25531Mh.A0R("selected_item", "ai_voice");
        c25531Mh.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A03);
        c25531Mh.A0M(EnumC72433Xdd.A02, "thread_type");
        c25531Mh.A0Z(24);
        return C0eB.A00;
    }
}
