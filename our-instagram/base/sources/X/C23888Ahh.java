package X;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.File;
import java.util.List;

/* renamed from: X.Ahh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23888Ahh implements InterfaceC58036PoM {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ MediaUploadMetadata A01;
    public final /* synthetic */ C8JT A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    @Override // X.InterfaceC58036PoM
    public final void Dv5(Exception exc, boolean z) {
        C8JT c8jt = this.A02;
        c8jt.A1q.A00();
        C50643MXf c50643MXf = c8jt.A0F;
        if (c50643MXf != null) {
            c50643MXf.A0H();
        }
        C50643MXf c50643MXf2 = c8jt.A0F;
        if (c50643MXf2 != null) {
            c50643MXf2.A0F();
        }
        C8JT.A16(c8jt, exc, this.A08, "onTranscodingFail", z, false);
    }

    public C23888Ahh(ImmutableList immutableList, MediaUploadMetadata mediaUploadMetadata, C8JT c8jt, File file, Boolean bool, Integer num, Integer num2, String str, String str2, List list) {
        this.A02 = c8jt;
        this.A05 = num;
        this.A01 = mediaUploadMetadata;
        this.A09 = list;
        this.A08 = str;
        this.A03 = file;
        this.A07 = str2;
        this.A00 = immutableList;
        this.A06 = num2;
        this.A04 = bool;
    }

    @Override // X.InterfaceC58036PoM
    public final void Dv4(C195868lW c195868lW, int i) {
        C86Q c86q;
        FrameLayout frameLayout;
        int i2;
        C8JT c8jt = this.A02;
        c8jt.A1q.A00();
        FragmentActivity activity = c8jt.A1B.getActivity();
        if (activity != null && !activity.isFinishing()) {
            Integer num = this.A05;
            if ((num != C05F.A01 || c8jt.A1k.A03.A04 == null) && (frameLayout = (c86q = c8jt.A1d).A00) != null) {
                AbstractC167017dG.A16(frameLayout, c86q);
                c86q.A00 = null;
                C8JT.A0m(c8jt);
            }
            c195868lW.A02().A00(this.A01);
            c195868lW.A0w = this.A09;
            File file = this.A03;
            String str = this.A07;
            ImmutableList immutableList = this.A00;
            Integer num2 = this.A06;
            if (num2 == null || (i2 = num2.intValue()) != 54) {
                i2 = 1;
            }
            C8JT.A0J(immutableList, null, EnumC1828489f.A09, c8jt, c195868lW, file, this.A04, num, str, i, i2, 0, i, false, true);
            c8jt.A1o.A01();
        }
    }
}
