package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Azi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24883Azi implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ C8NW A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;

    public RunnableC24883Azi(Medium medium, C8NW c8nw, File file, long j, long j2, boolean z) {
        this.A05 = z;
        this.A02 = medium;
        this.A04 = file;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = c8nw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A05) {
            Medium A01 = C8IU.A01(this.A02);
            String absolutePath = this.A04.getAbsolutePath();
            C14360o3.A0B(absolutePath, 0);
            A01.A0X = absolutePath;
            A01.A03 = (int) (this.A00 - this.A01);
            C8NW c8nw = this.A03;
            C148276lx c148276lx = C148276lx.A0a;
            C148276lx A00 = AbstractC148296lz.A00();
            C23108AGw c23108AGw = new C23108AGw();
            c23108AGw.A0F = true;
            c23108AGw.A0C = "StickerOverlayController";
            c23108AGw.A0B = 0;
            c23108AGw.A09 = Integer.valueOf(C8NW.A02(c8nw));
            try {
                UserSession userSession = c8nw.A0r;
                EnumC222999se enumC222999se = EnumC222999se.A06;
                Context context = c8nw.A0f;
                c8nw.A1G(new C210399Se(new C206169Az(AbstractC167017dG.A0A(context)), A01, userSession, enumC222999se, EnumC222939sY.A06, "gallery_story_video_sticker", 0.0f, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_video_sticker_width), context.getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width), -1, Integer.MIN_VALUE, false), A00, c23108AGw);
                return;
            } catch (IllegalArgumentException unused) {
                C9GR.A0B(c8nw.A0f, "select_gallery_video_failed");
                return;
            }
        }
        C9GR.A0B(this.A03.A0f, "gallery_video_creation_failed");
    }
}
