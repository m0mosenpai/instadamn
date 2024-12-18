package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49602Pt implements InterfaceC49612Pu {
    public boolean A00;
    public boolean A01;
    public final File A02;
    public final File A03;
    public final File A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final UserSession A08;

    private final void A00() {
        boolean z;
        try {
            AbstractC13530mf.A08(this.A06);
            AbstractC13530mf.A08(this.A02);
            AbstractC13530mf.A08(this.A03);
            z = true;
        } catch (IOException e) {
            C0w9.A06("PendingMediaClipsDirectoryProvider", "file system failure", e);
            z = false;
        }
        this.A00 = z;
    }

    public final File A01() {
        if (C18U.A06(C06090Tz.A05, this.A08, 36317929922434771L)) {
            if (!this.A00) {
                AbstractC13530mf.A08(this.A06);
                AbstractC13530mf.A08(this.A02);
                AbstractC13530mf.A08(this.A03);
                this.A00 = true;
            }
        } else if (!A02()) {
            throw new IllegalStateException("Check failed.");
        }
        return this.A06;
    }

    public final boolean A02() {
        if (!this.A00) {
            A00();
        }
        return this.A00;
    }

    public C49602Pt(Context context, UserSession userSession) {
        boolean z;
        this.A08 = userSession;
        File file = new File(context.getFilesDir(), AnonymousClass001.A0R(userSession.userId, "/clips"));
        this.A04 = file;
        this.A06 = new File(file, "drafts");
        this.A02 = new File(file, "temp");
        this.A03 = new File(file, MediaStreamTrack.AUDIO_TRACK_KIND);
        File file2 = new File(file, "panavideo");
        this.A07 = file2;
        this.A05 = new File(file, "covers");
        try {
            AbstractC13530mf.A08(file2);
            z = true;
        } catch (IOException e) {
            C0w9.A06("PendingMediaClipsDirectoryProvider", "file system failure whe creating pana source directory", e);
            z = false;
        }
        this.A01 = z;
        A00();
    }

    @Override // X.InterfaceC49612Pu
    public final File C5c() {
        if (A02()) {
            return this.A02;
        }
        throw new IllegalStateException("Check failed.");
    }
}
