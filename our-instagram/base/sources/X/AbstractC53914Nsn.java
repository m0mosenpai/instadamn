package X;

import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Nsn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53914Nsn {
    public static final void A00(InterfaceC49612Pu interfaceC49612Pu, File file, File file2, File file3, int i) {
        int i2 = i;
        AbstractC167017dG.A1S(file, file2);
        C14360o3.A0B(file3, 7);
        List singletonList = Collections.singletonList(new OTG(file));
        ArrayList A10 = AbstractC31174DnI.A10(singletonList);
        if (i < 0) {
            int i3 = -i2;
            MY5 A00 = MY5.A00("audio_burn_in_util");
            try {
                try {
                    A00.ESw(file2.getPath());
                    MediaFormat trackFormat = ((MY7) A00).A00.getTrackFormat(0);
                    C14360o3.A07(trackFormat);
                    int integer = trackFormat.getInteger(TraceFieldType.Bitrate);
                    int integer2 = trackFormat.getInteger("sample-rate");
                    int integer3 = trackFormat.getInteger("channel-count");
                    File A0w = MSW.A0w(interfaceC49612Pu.C5c(), AbstractC43591JPw.A00(1332));
                    new WG9().A06(new C70087W2j(integer, integer3, integer2), A0w, i3);
                    OTG otg = new OTG(A0w);
                    A00.release();
                    A10.add(otg);
                    i2 = 0;
                } catch (Throwable th) {
                    A00.release();
                    throw th;
                }
            } catch (C105764pn e) {
                throw new IOException(e);
            } catch (NullPointerException e2) {
                throw new IOException(e2);
            }
        }
        A10.add(new OTG(file2, i2));
        try {
            X9U x9u = WGM.A01;
            try {
                WGM wgm = WGM.A00;
                WGM.A05(singletonList);
                WGM.A04(wgm, x9u, file3, singletonList, A10, 1048576);
            } catch (C8CK e3) {
                C14360o3.A0B("Exception thrown while stitching the media files", 1);
            } catch (IOException e4) {
                C14360o3.A0B("Exception thrown while stitching the media files", 1);
                throw new Exception("Exception thrown while stitching the media files", e4);
            }
        } catch (C8CK e5) {
            throw new IOException(e5);
        }
    }
}
