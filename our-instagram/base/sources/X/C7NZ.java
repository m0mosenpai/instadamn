package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Iterator;

/* renamed from: X.7NZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NZ {
    public final /* synthetic */ C7NX A00;

    public final void A00(String str, String str2, long j, long j2, long j3, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 6);
        C161917Nb c161917Nb = this.A00.A00;
        if (c161917Nb != null) {
            Iterator it = c161917Nb.A06.iterator();
            while (it.hasNext()) {
                C7UD c7ud = ((C162017Nl) it.next()).A00;
                C7F3 c7f3 = c7ud.A02;
                String str3 = (String) c7ud.A04.invoke();
                String A00 = c7ud.A00();
                C14360o3.A0B(A00, 2);
                C18920wW c18920wW = c7f3.A01;
                C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ai_agent_embodiment_download"), 1);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    c25531Mh.A0R("video_id", str);
                    c25531Mh.A0P("fetched_time", Double.valueOf(j));
                    c25531Mh.A0Q(AbstractC43591JPw.A00(201), 0L);
                    c25531Mh.A0Q(AbstractC58317Pt9.A00(87), Long.valueOf(j2));
                    c25531Mh.A0Q("total_media_bytes", Long.valueOf(j3));
                    c25531Mh.A0O("is_prefetch", Boolean.valueOf(z));
                    c25531Mh.A0R("download_error", str2);
                    c25531Mh.A0R("agent_id", "");
                    c25531Mh.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                    c25531Mh.A0R("thread_session_id", A00);
                    c25531Mh.Cht();
                }
            }
        }
    }

    public C7NZ(C7NX c7nx) {
        this.A00 = c7nx;
    }
}
