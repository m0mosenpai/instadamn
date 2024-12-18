package X;

import android.database.sqlite.SQLiteDatabase;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Arrays;

/* renamed from: X.2Of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49242Of implements C1YX {
    public final void A00(C1Ye c1Ye) {
        c1Ye.A02(1);
        c1Ye.A05 = true;
        c1Ye.A03 = true;
        C1Ym[] c1YmArr = (C1Ym[]) AbstractC49252Og.A0f.getValue();
        c1Ye.A03((C1Ym[]) Arrays.copyOf(c1YmArr, c1YmArr.length));
        c1Ye.A09.add(new C2LL() { // from class: X.2PQ
            @Override // X.C2LL
            public final void A00(InterfaceC37481ol interfaceC37481ol) {
                C14360o3.A0B(interfaceC37481ol, 0);
                try {
                    C18920wW c18920wW = ((C22F) AnonymousClass229.A01(C023409i.A0A.A08(this))).A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_database_created");
                    if (A00.isSampled()) {
                        SQLiteDatabase sQLiteDatabase = ((C37471ok) interfaceC37481ol).A00;
                        A00.A9K("database_version", Long.valueOf(sQLiteDatabase.getVersion()));
                        A00.AAP("database_filepath", sQLiteDatabase.getPath());
                        A00.A8R(C22P.A5N, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A00.AAP("camera_session_id", "");
                        A00.A8p("event_type", 1);
                        A00.Cht();
                    }
                } catch (IllegalStateException unused) {
                }
            }

            @Override // X.C2LL
            public final void A02(InterfaceC37481ol interfaceC37481ol) {
                C14360o3.A0B(interfaceC37481ol, 0);
                try {
                    AnonymousClass229.A01(C023409i.A0A.A08(this));
                } catch (IllegalStateException unused) {
                }
            }

            @Override // X.C2LL
            public final void A01(InterfaceC37481ol interfaceC37481ol) {
                try {
                    C18920wW c18920wW = ((C22F) AnonymousClass229.A01(C023409i.A0A.A08(this))).A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_database_destructively_migrated");
                    if (A00.isSampled()) {
                        SQLiteDatabase sQLiteDatabase = ((C37471ok) interfaceC37481ol).A00;
                        A00.A9K("database_version", Long.valueOf(sQLiteDatabase.getVersion()));
                        A00.AAP("database_filepath", sQLiteDatabase.getPath());
                        A00.A8R(C22P.A5N, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A00.AAP("camera_session_id", "");
                        A00.A8p("event_type", 1);
                        A00.Cht();
                    }
                } catch (IllegalStateException unused) {
                }
            }
        });
    }

    @Override // X.C1YX
    public final String dbFilenamePrefix() {
        return "clips";
    }
}
