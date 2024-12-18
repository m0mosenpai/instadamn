package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FYG {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ffr, java.lang.Object] */
    public static C35199Ffr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("module_name".equals(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("click_point".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("interop_user_type".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("follow_status_name".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    obj.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("is_thread_pending".equals(A0s)) {
                    obj.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("is_thread_group".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("block_flow_entry_point_name".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("block_flow_surface_name".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.RequestID.equals(A0s)) {
                    obj.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("direct_source".equals(A0s)) {
                    obj.A01 = EnumC1579076z.valueOf(c16l.A1P());
                } else if ("direct_source_type".equals(A0s)) {
                    obj.A02 = EnumC33464Eqz.valueOf(c16l.A1P());
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C35199Ffr c35199Ffr) {
        anonymousClass182.A0d();
        String str = c35199Ffr.A09;
        if (str != null) {
            anonymousClass182.A0S("module_name", str);
        }
        String str2 = c35199Ffr.A07;
        if (str2 != null) {
            anonymousClass182.A0S("click_point", str2);
        }
        anonymousClass182.A0Q("interop_user_type", c35199Ffr.A00);
        String str3 = c35199Ffr.A08;
        if (str3 != null) {
            anonymousClass182.A0S("follow_status_name", str3);
        }
        String str4 = c35199Ffr.A0B;
        if (str4 != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        }
        Boolean bool = c35199Ffr.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_thread_pending", bool.booleanValue());
        }
        Boolean bool2 = c35199Ffr.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("is_thread_group", bool2.booleanValue());
        }
        String str5 = c35199Ffr.A05;
        if (str5 != null) {
            anonymousClass182.A0S("block_flow_entry_point_name", str5);
        }
        String str6 = c35199Ffr.A06;
        if (str6 != null) {
            anonymousClass182.A0S("block_flow_surface_name", str6);
        }
        String str7 = c35199Ffr.A0A;
        if (str7 != null) {
            anonymousClass182.A0S(TraceFieldType.RequestID, str7);
        }
        EnumC1579076z enumC1579076z = c35199Ffr.A01;
        if (enumC1579076z != null) {
            anonymousClass182.A0S("direct_source", enumC1579076z.toString());
        }
        EnumC33464Eqz enumC33464Eqz = c35199Ffr.A02;
        if (enumC33464Eqz != null) {
            anonymousClass182.A0S("direct_source_type", enumC33464Eqz.toString());
        }
        anonymousClass182.A0a();
    }
}
