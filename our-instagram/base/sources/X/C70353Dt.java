package X;

import android.content.Context;
import android.os.Build;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.3Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70353Dt implements InterfaceC11380iw, InterfaceC70363Du, InterfaceC70403Dy {
    public static final String __redex_internal_original_name = "MediaUploadLoggerImpl";
    public final Context A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final /* synthetic */ C3E0 A03;

    public C70353Dt(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A03 = new C3E0(userSession);
        this.A00 = context;
        this.A02 = userSession;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = this;
        this.A01 = c12210kP.A00();
    }

    public static final String A00(Throwable th) {
        Class<?> cls;
        String str = null;
        Throwable th2 = null;
        for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof FileNotFoundException) {
                return AnonymousClass001.A0S(MSV.A00(772), C50702MZx.A05(th3), ')');
            }
            if (th3 instanceof C902540k) {
                return "TimeoutCancellationException";
            }
            if (th3 instanceof CancellationException) {
                return "CancellationException";
            }
            th2 = th3;
        }
        if (th != null) {
            String simpleName = th.getClass().getSimpleName();
            if (th2 != null && (cls = th2.getClass()) != null) {
                str = cls.getSimpleName();
            }
            String A0T = AnonymousClass001.A0T(simpleName, str, ':');
            if (A0T != null) {
                return A0T;
            }
            return "unknown";
        }
        return "unknown";
    }

    private final void A03(C47Z c47z, int i) {
        Integer valueOf;
        java.util.Set set;
        Context context = this.A00;
        UserSession userSession = this.A02;
        C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
        C915547l c915547l = c47z.A1T;
        C47Z c47z2 = c50703MZy.A02;
        A04(c47z, this, C70343Ds.A01(c47z2), AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)), C50702MZx.A01(userSession, c47z), C50702MZx.A02(userSession, c47z, i), i, c50703MZy.A0J());
        synchronized (c915547l) {
            java.util.Set set2 = c915547l.A0D;
            valueOf = Integer.valueOf(i);
            set2.add(valueOf);
        }
        String A01 = C70343Ds.A01(c47z2);
        synchronized (c915547l) {
            C14360o3.A0B(A01, 0);
            if (c915547l.A0A.get(A01) == null) {
                c915547l.A0A.put(A01, new C9BH(AbstractC16830sb.A06(valueOf)));
            } else {
                C9BH c9bh = (C9BH) c915547l.A0A.get(A01);
                if (c9bh != null && (set = (java.util.Set) c9bh.A00) != null) {
                    set.add(valueOf);
                }
            }
        }
        if (c47z.A11() || AbstractC210079Qv.A08(c47z)) {
            C50665MYi c50665MYi = new C50665MYi(userSession);
            try {
                HashMap A00 = AbstractC54091Nvp.A00(c47z, c50665MYi);
                HashMap hashMap = new HashMap();
                hashMap.putAll(A00);
                AbstractC68335VMv.A00(c50665MYi, null, "media_upload_flow_start", hashMap, c50665MYi.now() - c50665MYi.now());
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("share type: ");
                sb.append(c47z.A0D());
                C0w9.A05("videolite_event_err_start", sb.toString(), 1, th);
            }
        }
    }

    public final void A07(C47Z c47z, String str, String str2, int i) {
        C14360o3.A0B(str, 1);
        C3E0 c3e0 = this.A03;
        if (c47z != null && c47z.A5D) {
            return;
        }
        int hashCode = AnonymousClass001.A0G(str, ':', i).hashCode();
        UserFlowLogger userFlowLogger = c3e0.A00;
        long generateFlowId = userFlowLogger.generateFlowId(51052545, hashCode);
        if (c47z != null && c47z.A5D) {
            return;
        }
        userFlowLogger.flowStart(generateFlowId, str2, false);
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "publish_id", i);
        userFlowLogger.flowAnnotate(generateFlowId, "start_source", str2);
        if (c47z == null) {
            return;
        }
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z));
        UserSession userSession = c3e0.A01;
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "ingest_surface", C50702MZx.A01(userSession, c47z));
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "target_surface", C50702MZx.A03(userSession, c47z, null, true));
        userFlowLogger.flowAnnotate(generateFlowId, "share_type", c47z.A0D().name());
        boolean z = false;
        if (c47z.A3O != null) {
            z = true;
        }
        userFlowLogger.flowAnnotate(generateFlowId, "is_carousel_item", z);
        userFlowLogger.flowAnnotate(generateFlowId, "ingest_type", C50702MZx.A04(c47z));
        userFlowLogger.flowAnnotate(generateFlowId, "media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z)));
    }

    @Override // X.InterfaceC70403Dy
    public final void ABa(C47Z c47z, int i) {
        this.A03.ABa(c47z, i);
    }

    @Override // X.InterfaceC70403Dy
    public final void ABb(C47Z c47z, int i) {
        this.A03.ABb(c47z, i);
    }

    @Override // X.InterfaceC70403Dy
    public final void CkY(C70129W5q c70129W5q, C47Z c47z) {
        this.A03.CkY(c70129W5q, c47z);
    }

    @Override // X.InterfaceC70363Du
    public final void Ckw(EnumC115415Kb enumC115415Kb, C47Z c47z, String str, String str2, Throwable th) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C1ZX A01 = C1ZV.A00(this.A02).A01(C05F.A0Y, C05F.A0L, false);
        String A00 = AbstractC111324zv.A00(2317);
        A01.A03(A00, str);
        A01.A03("error_message", str2);
        A01(A01, enumC115415Kb, c47z);
        if (th == null) {
            A01.A03("logview_group_by", A00);
        } else {
            A01.A05(th);
        }
        A01.A00();
    }

    @Override // X.InterfaceC70403Dy
    public final void Cl0(C47Z c47z, String str, String str2) {
        this.A03.Cl0(c47z, str, str2);
    }

    @Override // X.InterfaceC70403Dy
    public final void Cl1(C47Z c47z, String str, String str2) {
        this.A03.Cl1(c47z, "ig_media_upload_failure", str2);
    }

    @Override // X.InterfaceC70373Dv
    public final void EHI(C47Z c47z) {
        String str;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_publish_server_failure");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A00(), C70343Ds.A01(c47z2));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            Long A0C = new C50703MZy(context, userSession, c47z).A0C();
            Map map = null;
            if (A0C != null) {
                str = A0C.toString();
            } else {
                str = null;
            }
            A00.AAP("media_id", str);
            A00.AAP("publish_id", String.valueOf(c47z.A1T.A00()));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            if (!c47z.A5D) {
                map = c50703MZy.A07();
            }
            A00.A9M("custom_fields", map);
            A00.AAP("from_draft", String.valueOf(c47z.A5S));
            A00.A7v("is_panavision", false);
            A00.A8I("client_upload_mos", Double.valueOf(c47z.A1j.A00));
            A00.A9K("media_creation_time", Long.valueOf(c47z.A0g / 1000));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC70373Dv
    public final void EHJ(C47Z c47z) {
        Map A07;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_upload_configure_params_failure");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A00(), C70343Ds.A01(c47z2));
            A00.AAP("publish_id", String.valueOf(c47z.A1T.A00()));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            A00.A9M("custom_fields", A07);
            A00.A9K(MSV.A00(434), null);
            A00.AAP("from_draft", String.valueOf(c47z.A5S));
            A00.A7v("is_panavision", false);
            A00.A8I("client_upload_mos", Double.valueOf(c47z.A1j.A00));
            A00.A9K("media_creation_time", Long.valueOf(c47z.A0g / 1000));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC70373Dv
    public final void EHK(EnumC115415Kb enumC115415Kb, C47Z c47z, String str, Throwable th) {
        String str2;
        C14360o3.A0B(str, 1);
        Iterator it = c47z.A1T.A03().iterator();
        while (it.hasNext()) {
            EHa(enumC115415Kb, c47z, null, null, null, null, str, th, ((Number) it.next()).intValue());
        }
        A06(c47z, TraceFieldType.FailureReason, str);
        if (enumC115415Kb != null) {
            str2 = enumC115415Kb.name();
        } else {
            str2 = null;
        }
        A06(c47z, "error_type", str2);
        Cl0(c47z, "ig_media_publish_failure", null);
        A05(c47z, this, th);
    }

    @Override // X.InterfaceC70363Du
    public final void EHd(C47Z c47z, String str) {
        int A00;
        Map A07;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_media_publish_cancel");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C915547l c915547l = c47z.A1T;
            List A03 = c915547l.A03();
            if (!A03.isEmpty()) {
                A00 = ((Number) A03.get(0)).intValue();
            } else {
                A00 = c915547l.A00();
            }
            if (C50702MZx.A00.A0A(userSession, c47z, A00) && !C14360o3.A0K(c915547l.A02(A00, C70343Ds.A01(c50703MZy.A02)), true)) {
                return;
            }
            C47Z c47z2 = c50703MZy.A02;
            A002.AAP(AbstractC31188DnX.A00(), C70343Ds.A01(c47z2));
            A002.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A002.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A002.AAP("publish_id", String.valueOf(A00));
            A002.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A002.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A002.AAP("ingest_type", c50703MZy.A0I());
            A002.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
            A002.A9K("duration_ms", c50703MZy.A08());
            A002.A9K("file_size_bytes", c50703MZy.A09());
            A002.A9K("original_file_size_bytes", c50703MZy.A0E());
            A002.A9K("media_height", c50703MZy.A0B());
            A002.A9K("media_width", c50703MZy.A0D());
            A002.A9K("original_media_height", c50703MZy.A0F());
            A002.A9K("original_media_width", c50703MZy.A0G());
            A002.AAP("reason", str);
            A002.AAP("application_state", AbstractC101994iE.A00());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            A002.A9M("custom_fields", A07);
            A002.AAk("server_edits", C50702MZx.A06(userSession, c47z, false));
            A002.Cht();
        }
    }

    @Override // X.InterfaceC70363Du
    public final void EHe(C47Z c47z, String str, int i) {
        String str2;
        boolean z;
        Map A07;
        C14360o3.A0B(c47z, 0);
        C14360o3.A0B(str, 2);
        C115435Kd c115435Kd = c47z.A6I;
        if (c115435Kd == null || (str2 = c115435Kd.A02) == null) {
            str2 = "no_error";
        }
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_publish_user_abandon");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            if (C50702MZx.A00.A0A(userSession, c47z, i) && !C14360o3.A0K(c47z.A1T.A02(i, C70343Ds.A01(c50703MZy.A02)), true)) {
                return;
            }
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.AAP("publish_id", String.valueOf(i));
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A00.AAP("ingest_type", c50703MZy.A0I());
            A00.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
            A00.A9K("duration_ms", c50703MZy.A08());
            A00.A9K("file_size_bytes", c50703MZy.A09());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("media_height", c50703MZy.A0B());
            A00.A9K("media_width", c50703MZy.A0D());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            A00.AAP("reason", str);
            A00.AAP("error_message", str2);
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
                A07.put("upload_id", c47z.A3t);
            }
            A00.A9M("custom_fields", A07);
            A00.AAk("server_edits", C50702MZx.A06(userSession, c47z, false));
            A00.Cht();
        }
        C915547l c915547l = c47z.A1T;
        synchronized (c915547l) {
            z = !c915547l.A0D.isEmpty();
        }
        if (!z) {
            return;
        }
        if (!c47z.A11() && !AbstractC210079Qv.A08(c47z)) {
            return;
        }
        C50665MYi c50665MYi = new C50665MYi(this.A02);
        try {
            HashMap A002 = AbstractC54091Nvp.A00(c47z, c50665MYi);
            HashMap hashMap = new HashMap();
            hashMap.putAll(A002);
            AbstractC68335VMv.A00(c50665MYi, null, "media_upload_flow_cancel", hashMap, c50665MYi.now());
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("share type: ");
            sb.append(c47z.A0D());
            C0w9.A05("videolite_event_err_cancel", sb.toString(), 1, th);
        }
    }

    @Override // X.InterfaceC70373Dv
    public final void EHf(EnumC115415Kb enumC115415Kb, C47Z c47z, String str, Throwable th) {
        String str2;
        Map A07;
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_upload_failure");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A00.AAP("ingest_type", c50703MZy.A0I());
            A00.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
            A00.A9K("duration_ms", c50703MZy.A08());
            A00.A9K("file_size_bytes", c50703MZy.A09());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("media_height", c50703MZy.A0B());
            A00.A9K("media_width", c50703MZy.A0D());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            A00.AAP("reason", A00(th));
            StringBuilder sb = new StringBuilder();
            sb.append("errorType:");
            sb.append(enumC115415Kb);
            sb.append(", message:");
            sb.append(str);
            A00.AAP("error_message", sb.toString());
            A00.A9M("exception_data", AbstractC54088Nvm.A00(th));
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c47z.A5p) {
                A00.A7v("is_video_variant", true);
            }
            A00.Cht();
        }
        if (th != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c47z.A1G);
            sb2.append("_UPLOAD_FAILURE");
            Ckw(enumC115415Kb, c47z, sb2.toString(), str, th);
        }
        A06(c47z, TraceFieldType.FailureReason, str);
        if (enumC115415Kb != null) {
            str2 = enumC115415Kb.name();
        } else {
            str2 = null;
        }
        A06(c47z, "error_type", str2);
        Cl0(c47z, "ig_media_upload_failure", null);
        A05(c47z, this, th);
    }

    @Override // X.InterfaceC70393Dx
    public final void EHh(EnumC115415Kb enumC115415Kb, C47Z c47z, String str, String str2, Throwable th) {
        String str3;
        String str4;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_video_render_failure");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            Map A07 = c50703MZy.A07();
            A07.put("is_high_quality_upload_on", String.valueOf(AbstractC23021Ah.A00(userSession).A20()));
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            applicationContext.getPackageManager();
            C14360o3.A0C(applicationContext.getSystemService("phone"), AbstractC111324zv.A00(478));
            C14360o3.A0C(applicationContext.getSystemService("activity"), MSV.A00(236));
            C14360o3.A0C(applicationContext.getSystemService("power"), "null cannot be cast to non-null type android.os.PowerManager");
            A07.putAll(SUH.A00(applicationContext));
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            if (c47z.A0D() == ShareType.A0V) {
                str4 = C50702MZx.A03(userSession, c47z, null, true);
            } else {
                str4 = null;
            }
            A00.AAP("target_surface", str4);
            A00.AAP("ingest_type", c50703MZy.A0I());
            A00.A9K("duration_ms", c50703MZy.A08());
            A00.A9K("file_size_bytes", c50703MZy.A09());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("media_height", c50703MZy.A0B());
            A00.A9K("media_width", c50703MZy.A0D());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            A00.AAP("reason", str2);
            StringBuilder sb = new StringBuilder();
            sb.append("reason: ");
            sb.append(str2);
            sb.append(", errorType:");
            sb.append(enumC115415Kb);
            sb.append(", message:");
            sb.append(str);
            A00.AAP("error_message", sb.toString());
            A00.A9M("exception_data", AbstractC54088Nvm.A00(th));
            A00.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
            if (c47z.A5D) {
                A07 = null;
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            A00.Cht();
        }
        Throwable th2 = th;
        C1ZX A01 = C1ZV.A00(this.A02).A01(C05F.A0Y, C05F.A0V, false);
        A01(A01, enumC115415Kb, c47z);
        String A002 = MSV.A00(1664);
        A01.A03(A002, str);
        if (th == null) {
            A01.A03("logview_group_by", A002);
        } else {
            Throwable cause = th.getCause();
            if (cause != null) {
                th2 = cause;
            }
            A01.A05(th2);
        }
        A01.A00();
        A06(c47z, TraceFieldType.FailureReason, str);
        if (enumC115415Kb != null) {
            str3 = enumC115415Kb.name();
        } else {
            str3 = null;
        }
        A06(c47z, "error_type", str3);
        Cl0(c47z, "ig_video_render_failure", null);
        A05(c47z, this, th);
    }

    @Override // X.InterfaceC70373Dv
    public final void EHr(C47Z c47z) {
        Map A07;
        C14360o3.A0B(c47z, 0);
        if (c47z.A0t()) {
            Iterator it = c47z.A0K().iterator();
            while (it.hasNext()) {
                EHr((C47Z) it.next());
            }
            return;
        }
        C915547l c915547l = c47z.A1T;
        if (!c915547l.A0G) {
            C18920wW c18920wW = this.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_publish_ready");
            if (A00.isSampled()) {
                Context context = this.A00;
                UserSession userSession = this.A02;
                C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
                C47Z c47z2 = c50703MZy.A02;
                A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
                A00.AAP("ingest_id", c50703MZy.A0H());
                A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
                A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
                A00.A9K("duration_ms", c50703MZy.A08());
                A00.A9K("file_size_bytes", c50703MZy.A09());
                A00.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
                A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
                A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
                if (c47z.A5D) {
                    A07 = null;
                } else {
                    A07 = c50703MZy.A07();
                }
                A00.A9M("custom_fields", A07);
                A00.AAP("application_state", AbstractC101994iE.A00());
                A00.Cht();
            }
            Cl0(c47z, "ig_media_publish_ready", null);
            c915547l.A0G = true;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_upload_flow";
    }

    private final void A01(C1ZX c1zx, EnumC115415Kb enumC115415Kb, C47Z c47z) {
        String str;
        c1zx.A03("upload_id", c47z.A3t);
        UserSession userSession = this.A02;
        c1zx.A03(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z));
        C22P c22p = c47z.A0i;
        if (c22p != null) {
            str = c22p.name();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1zx.A03("camera_entry_point", str);
        String str3 = c47z.A2h;
        if (str3 != null) {
            str2 = str3;
        }
        c1zx.A03("creation_surface", str2);
        c1zx.A03("share_type", c47z.A0D().name());
        c1zx.A03("media_type", c47z.A1G.name());
        c1zx.A03("ingestion_surface", C50702MZx.A01(userSession, c47z));
        boolean z = false;
        if (c47z.A3O != null) {
            z = true;
        }
        c1zx.A04("is_carousel_child", z);
        c1zx.A04("publish_invoked", AbstractC210079Qv.A03(c47z));
        if (enumC115415Kb != null) {
            c1zx.A03("error_type", enumC115415Kb.name());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C3o9 r11, X.C47Z r12, X.C70353Dt r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70353Dt.A02(X.3o9, X.47Z, X.3Dt, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    public static final void A04(C47Z c47z, C70353Dt c70353Dt, String str, String str2, String str3, String str4, int i, boolean z) {
        Map A07;
        C18920wW c18920wW = c70353Dt.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_publish_invoke");
        if (A00.isSampled()) {
            Context context = c70353Dt.A00;
            C50704MZz c50704MZz = new C50704MZz(context);
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), str);
            A00.AAP("publish_id", String.valueOf(i));
            A00.AAP("ingest_surface", str3);
            A00.AAP("target_surface", str4);
            A00.AAP("media_type", str2);
            A00.AAP("connection", AbstractC15820qc.A08(c50704MZz.A00));
            A00.A7v("is_carousel_item", Boolean.valueOf(z));
            ArrayList arrayList = null;
            if (c47z != null) {
                if (c47z.A5D) {
                    A07 = null;
                } else {
                    A07 = new C50703MZy(context, c70353Dt.A02, c47z).A07();
                }
            } else {
                A07 = c50704MZz.A07();
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c47z != null) {
                arrayList = C50702MZx.A06(c70353Dt.A02, c47z, true);
            }
            A00.AAk("server_edits", arrayList);
            if (c47z != null) {
                A00.A9K("media_creation_time", Long.valueOf(c47z.A0g / 1000));
            }
            A00.Cht();
        }
        if (c47z != null) {
            str3 = "user_share";
        }
        c70353Dt.A07(c47z, str, str3, i);
    }

    public final void A06(C47Z c47z, String str, String str2) {
        this.A03.A02(c47z, str, str2);
    }

    public final void A08(C47Z c47z, Map map, long j) {
        String str;
        boolean z;
        Float f;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_upload_success");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            Map A07 = c50703MZy.A07();
            if (j > 0) {
                A07.put("upload_speed_bps", String.valueOf(j));
            }
            A07.putAll(map);
            if (Build.VERSION.SDK_INT >= 34 && c47z.A1G == EnumC40111tc.A0Q && C18U.A06(C06090Tz.A05, userSession, 36320876269937629L)) {
                String str2 = c47z.A3K;
                String str3 = c47z.A33;
                C23110AGz c23110AGz = C23110AGz.A00;
                A07.putAll(c23110AGz.A00(str2));
                A07.put("original_is_hdr", AnonymousClass001.A1D("", c23110AGz.A01(str2)));
                A07.put("result_is_hdr", AnonymousClass001.A1D("", c23110AGz.A01(str3)));
                boolean z2 = true;
                boolean z3 = false;
                if (c47z.A2k != null) {
                    z3 = true;
                }
                C55W c55w = c47z.A1a;
                if (c55w != null) {
                    Integer num = c55w.A0P;
                    z = true;
                    if ((num == null || num.intValue() == 0) && ((f = c55w.A07) == null || C14360o3.A0I(f, 1.0f))) {
                        List A1Q = AbstractC16960so.A1Q(c55w.A0N, c55w.A03, c55w.A04, c55w.A06, c55w.A08, c55w.A09, c55w.A0A, c55w.A0B, c55w.A0C, c55w.A0D, c55w.A0E, c55w.A0F, c55w.A0G, c55w.A0H, c55w.A0I, c55w.A02, c55w.A0J, c55w.A0Q, c55w.A0K, c55w.A0R, c55w.A0L, c55w.A0S, c55w.A0M);
                        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
                            Iterator it = A1Q.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!z3 && !z) {
                        z2 = false;
                    }
                    A07.put("has_edits", AnonymousClass001.A1D("", z2));
                }
                z = false;
                if (!z3) {
                    z2 = false;
                }
                A07.put("has_edits", AnonymousClass001.A1D("", z2));
            }
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            Long A0C = c50703MZy.A0C();
            if (A0C != null) {
                str = A0C.toString();
            } else {
                str = null;
            }
            A00.AAP("media_id", str);
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A00.A9K("duration_ms", c50703MZy.A08());
            A00.A9K("file_size_bytes", c50703MZy.A09());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("media_height", c50703MZy.A0B());
            A00.A9K("media_width", c50703MZy.A0D());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            A00.AAP("ingest_type", c50703MZy.A0I());
            if (c47z.A5D) {
                A07 = null;
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            A00.A8I("client_upload_mos", Double.valueOf(c47z.A1j.A00));
            if (c47z.A5p) {
                A00.A7v("is_video_variant", true);
            }
            A00.Cht();
        }
        Cl0(c47z, "ig_media_upload_success", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (X.C14360o3.A0K(r13, X.MSV.A00(432)) != false) goto L9;
     */
    @Override // X.InterfaceC70373Dv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EHL(X.C3o9 r18, X.C47Z r19, boolean r20) {
        /*
            r17 = this;
            r7 = r19
            X.47l r2 = r7.A1T
            java.util.List r0 = r2.A03()
            java.util.Iterator r5 = r0.iterator()
        Lc:
            boolean r0 = r5.hasNext()
            r8 = r17
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r14 = r0.intValue()
            android.content.Context r0 = r8.A00
            com.instagram.common.session.UserSession r4 = r8.A02
            X.MZy r3 = new X.MZy
            r3.<init>(r0, r4, r7)
            java.lang.Long r9 = r3.A0C()
            java.lang.String r13 = X.C50702MZx.A02(r4, r7, r14)
            r0 = 431(0x1af, float:6.04E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = X.C14360o3.A0K(r13, r0)
            if (r0 != 0) goto L48
            r0 = 432(0x1b0, float:6.05E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r1 = X.C14360o3.A0K(r13, r0)
            r0 = 0
            if (r1 == 0) goto L49
        L48:
            r0 = 1
        L49:
            if (r9 == 0) goto L4e
            if (r0 == 0) goto L4e
            r9 = 0
        L4e:
            X.MZx r0 = X.C50702MZx.A00
            boolean r0 = r0.A0A(r4, r7, r14)
            if (r0 == 0) goto L79
            X.47l r1 = r7.A1T
            X.47Z r0 = r3.A02
            java.lang.String r0 = X.C70343Ds.A01(r0)
            java.lang.Boolean r1 = r1.A02(r14, r0)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L79
        L6d:
            monitor-enter(r2)
            java.util.Set r1 = r2.A0E     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L97
            r1.add(r0)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r2)
            goto Lc
        L79:
            X.47Z r0 = r3.A02
            java.lang.String r10 = X.C70343Ds.A01(r0)
            java.lang.Integer r0 = X.C50702MZx.A00(r0)
            java.lang.String r11 = X.AbstractC44300Jhr.A00(r0)
            java.lang.String r12 = X.C50702MZx.A01(r4, r7)
            boolean r15 = r3.A0J()
            r6 = r18
            r16 = r20
            A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L6d
        L97:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L9a:
            boolean r0 = r7.A11()
            if (r0 != 0) goto La6
            boolean r0 = X.AbstractC210079Qv.A08(r7)
            if (r0 == 0) goto Le0
        La6:
            com.instagram.common.session.UserSession r0 = r8.A02
            X.MYi r8 = new X.MYi
            r8.<init>(r0)
            r3 = 1
            java.util.HashMap r0 = X.AbstractC54091Nvp.A00(r7, r8)     // Catch: java.lang.Throwable -> Lc5
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lc5
            r11.<init>()     // Catch: java.lang.Throwable -> Lc5
            r11.putAll(r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r10 = "media_upload_flow_success"
            r9 = 0
            long r12 = r8.now()     // Catch: java.lang.Throwable -> Lc5
            X.AbstractC68335VMv.A00(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc5
            return
        Lc5:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "share type: "
            r1.append(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0D()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "videolite_event_err_success"
            X.C0w9.A05(r0, r1, r3, r2)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70353Dt.EHL(X.3o9, X.47Z, boolean):void");
    }

    @Override // X.InterfaceC70373Dv
    public final void EHR(C47Z c47z, InterfaceC40171tl interfaceC40171tl, String str, boolean z) {
        Map A07;
        if (!c47z.A4s.contains(Integer.valueOf(c47z.A1T.A00()))) {
            int A00 = c47z.A1T.A00();
            if (z) {
                C18920wW c18920wW = this.A01;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_media_upload_configure_params_success");
                if (A002.isSampled()) {
                    Context context = this.A00;
                    UserSession userSession = this.A02;
                    C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
                    C47Z c47z2 = c50703MZy.A02;
                    A002.AAP(AbstractC31188DnX.A00(), C70343Ds.A01(c47z2));
                    A002.AAP("publish_id", String.valueOf(A00));
                    A002.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
                    A002.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
                    A002.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
                    A002.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
                    A002.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
                    A002.AAP("application_state", AbstractC101994iE.A00());
                    if (c47z.A5D) {
                        A07 = null;
                    } else {
                        A07 = c50703MZy.A07();
                    }
                    A002.A9M("custom_fields", A07);
                    A002.A9K(MSV.A00(434), null);
                    A002.AAP("from_draft", String.valueOf(c47z.A5S));
                    A002.A7v("is_panavision", false);
                    A002.A8I("client_upload_mos", Double.valueOf(c47z.A1j.A00));
                    A002.A9K("media_creation_time", Long.valueOf(c47z.A0g / 1000));
                    A002.Cht();
                }
            } else {
                c47z.A4s.add(Integer.valueOf(A00));
            }
            Cl0(c47z, MSV.A00(473), null);
        }
    }

    @Override // X.InterfaceC70383Dw
    public final void EHa(EnumC115415Kb enumC115415Kb, C47Z c47z, String str, String str2, String str3, String str4, String str5, Throwable th, int i) {
        C50703MZy c50703MZy;
        String str6;
        String str7;
        Boolean bool;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Map A07;
        String str8;
        Long A0C;
        String str9 = str5;
        String str10 = str4;
        String str11 = str2;
        String str12 = str;
        if (c47z != null) {
            UserSession userSession = this.A02;
            str12 = C50702MZx.A01(userSession, c47z);
            str11 = C50702MZx.A02(userSession, c47z, i);
        }
        ArrayList arrayList = null;
        if (c47z != null) {
            c50703MZy = new C50703MZy(this.A00, this.A02, c47z);
        } else {
            c50703MZy = null;
        }
        C50704MZz c50704MZz = new C50704MZz(this.A00);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_publish_failure");
        if (!C14360o3.A0K(str11, MSV.A00(431))) {
            C14360o3.A0K(str11, MSV.A00(432));
        }
        if (A00.isSampled()) {
            String valueOf = String.valueOf(i);
            if (c50703MZy == null || (str6 = C70343Ds.A01(c50703MZy.A02)) == null) {
                str6 = str3;
                if (str3 == null) {
                    str6 = valueOf;
                }
            }
            if (c47z != null && c50703MZy != null && C50702MZx.A00.A0A(this.A02, c47z, i) && !C14360o3.A0K(c47z.A1T.A02(i, C70343Ds.A01(c50703MZy.A02)), true)) {
                return;
            }
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), str6);
            A00.AAP("connection", AbstractC15820qc.A08(c50704MZz.A00));
            if (c50703MZy != null) {
                str10 = AbstractC44300Jhr.A00(C50702MZx.A00(c50703MZy.A02));
            }
            A00.AAP("media_type", str10);
            A00.AAP("publish_id", valueOf);
            A00.AAP("ingest_surface", str12);
            A00.AAP("target_surface", str11);
            if (c50703MZy != null) {
                str7 = c50703MZy.A0I();
            } else {
                str7 = null;
            }
            A00.AAP("ingest_type", str7);
            if (c50703MZy != null) {
                bool = Boolean.valueOf(c50703MZy.A0J());
            } else {
                bool = null;
            }
            A00.A7v("is_carousel_item", bool);
            if (c50703MZy != null) {
                l = c50703MZy.A08();
            } else {
                l = null;
            }
            A00.A9K("duration_ms", l);
            if (c50703MZy != null) {
                l2 = c50703MZy.A09();
            } else {
                l2 = null;
            }
            A00.A9K("file_size_bytes", l2);
            if (c50703MZy != null) {
                l3 = c50703MZy.A0E();
            } else {
                l3 = null;
            }
            A00.A9K("original_file_size_bytes", l3);
            if (c50703MZy != null) {
                l4 = c50703MZy.A0B();
            } else {
                l4 = null;
            }
            A00.A9K("media_height", l4);
            if (c50703MZy != null) {
                l5 = c50703MZy.A0D();
            } else {
                l5 = null;
            }
            A00.A9K("media_width", l5);
            if (c50703MZy != null) {
                l6 = c50703MZy.A0F();
            } else {
                l6 = null;
            }
            A00.A9K("original_media_height", l6);
            if (c50703MZy != null) {
                l7 = c50703MZy.A0G();
            } else {
                l7 = null;
            }
            A00.A9K("original_media_width", l7);
            A00.AAP("reason", str9);
            StringBuilder sb = new StringBuilder();
            sb.append("errorType:");
            sb.append(enumC115415Kb);
            sb.append(", message:");
            sb.append(str9);
            A00.AAP("error_message", sb.toString());
            A00.A9M("exception_data", AbstractC54088Nvm.A00(th));
            if (c47z != null && c47z.A5D) {
                A07 = null;
            } else if (c50703MZy != null) {
                A07 = c50703MZy.A07();
            } else {
                A07 = c50704MZz.A07();
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c50703MZy != null && (A0C = c50703MZy.A0C()) != null) {
                str8 = A0C.toString();
            } else {
                str8 = null;
            }
            A00.AAP("media_id", str8);
            if (c47z != null) {
                arrayList = C50702MZx.A06(this.A02, c47z, false);
            }
            A00.AAk("server_edits", arrayList);
            A00.Cht();
        }
        if (c47z == null || th == null) {
            return;
        }
        if (str5 == null && (str9 = th.getMessage()) == null) {
            str9 = "";
        }
        Ckw(enumC115415Kb, c47z, "MEDIA_PUBLISH_FAILURE", str9, th);
    }

    @Override // X.InterfaceC70373Dv
    public final void EHg(C47Z c47z) {
        Map A07;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_media_upload_start");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A00.A9K("duration_ms", c50703MZy.A08());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            A00.AAP("ingest_type", c50703MZy.A0I());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            A00.A9M("custom_fields", A07);
            A00.AAP("application_state", AbstractC101994iE.A00());
            if (c47z.A5p) {
                A00.A7v("is_video_variant", true);
            }
            A00.Cht();
        }
        Cl0(c47z, "ig_media_upload_start", null);
    }

    @Override // X.InterfaceC70393Dx
    public final void EHi(C47Z c47z, Map map) {
        String str;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_video_render_start");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            Map A07 = c50703MZy.A07();
            if (map != null) {
                A07.putAll(map);
            }
            A07.put("transcoder_type", c47z.A3q);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("ingest_id", C70343Ds.A01(c47z2));
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            String A0I = c50703MZy.A0I();
            if (A0I != null) {
                A00.AAP("ingest_type", A0I);
                A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
                if (c47z.A5D) {
                    A07 = null;
                }
                A00.A9M("custom_fields", A07);
                if (c47z.A0D() == ShareType.A0V) {
                    str = C50702MZx.A03(userSession, c47z, null, true);
                } else {
                    str = null;
                }
                A00.AAP("target_surface", str);
                A00.AAP("application_state", AbstractC101994iE.A00());
                A00.Cht();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Cl0(c47z, "ig_video_render_start", null);
    }

    @Override // X.InterfaceC70393Dx
    public final void EHj(C47Z c47z) {
        String str;
        String str2;
        Map A07;
        int i;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_video_render_success");
        if (A00.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            A00.AAP(AbstractC31188DnX.A02(9, 10, 13), C70343Ds.A01(c47z2));
            A00.AAP("ingest_id", c50703MZy.A0H());
            A00.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            if (c47z.A0D() == ShareType.A0V) {
                str = C50702MZx.A03(userSession, c47z, null, true);
            } else {
                str = null;
            }
            A00.AAP("target_surface", str);
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.A9K("duration_ms", c50703MZy.A08());
            if (c47z2.A11()) {
                str2 = c47z2.A1j.A05;
            } else {
                str2 = null;
            }
            A00.AAP("video_codec", str2);
            A00.A9K("file_size_bytes", c50703MZy.A09());
            A00.A9K("original_file_size_bytes", c50703MZy.A0E());
            A00.A9K("media_height", c50703MZy.A0B());
            A00.A9K("media_width", c50703MZy.A0D());
            A00.A9K("original_media_height", c50703MZy.A0F());
            A00.A9K("original_media_width", c50703MZy.A0G());
            float f = c50703MZy.A01.A01;
            Float valueOf = Float.valueOf(f);
            boolean z = false;
            if (f > 0.0f) {
                z = true;
            }
            Double d = null;
            if (z && valueOf != null) {
                d = Double.valueOf(f);
            }
            A00.A8I("original_frame_rate", d);
            float f2 = c47z2.A03;
            Float valueOf2 = Float.valueOf(f2);
            boolean z2 = false;
            if (f2 > 0.0f) {
                z2 = true;
            }
            Double d2 = null;
            if (z2 && valueOf2 != null) {
                d2 = Double.valueOf(f2);
            }
            A00.A8I(MSV.A00(449), d2);
            A00.AAP("ingest_type", c50703MZy.A0I());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            A00.A9M("custom_fields", A07);
            C56W c56w = c47z2.A1W;
            Double d3 = null;
            if (c56w != null && (i = c56w.A00) != -1) {
                d3 = Double.valueOf(i);
            }
            A00.A8I(MSV.A00(1650), d3);
            A00.AAP("application_state", AbstractC101994iE.A00());
            A00.Cht();
        }
        Cl0(c47z, "ig_video_render_success", null);
        A06(c47z, "rendered_file_path", c47z.A3V);
        A06(c47z, "streaming_file_path", c47z.A3V);
    }

    @Override // X.InterfaceC70413Dz
    public final void EHo(C47Z c47z, Throwable th) {
        long j;
        C50703MZy c50703MZy = new C50703MZy(this.A00, this.A02, c47z);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "measure_quality_failure");
        if (A00.isSampled()) {
            C47Z c47z2 = c50703MZy.A02;
            A00.A9K("upload_id", Long.valueOf(Long.parseLong(c47z2.A3t)));
            A00.AAP("connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            A00.AAP("from", c47z2.A1f.toString());
            A00.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c47z2)));
            A00.AAP("share_type", c47z2.A0D().toString());
            String A0E = c47z2.A0E();
            if (A0E.length() == 0) {
                A0E = null;
            }
            A00.AAP("waterfall_id", A0E);
            A00.A9K("dimension", c50703MZy.A0D());
            A00.A9K(MSV.A00(1124), c50703MZy.A0B());
            A00.A9K("video_duration", c50703MZy.A08());
            if (c50703MZy.A0J()) {
                j = 1;
            } else {
                j = 0;
            }
            A00.A9K("is_carousel_child", Long.valueOf(j));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC70373Dv
    public final void EHq(C47Z c47z, int i) {
        if (c47z.A1G == EnumC40111tc.A0R) {
            Iterator it = c47z.A4m.iterator();
            while (it.hasNext()) {
                A03((C47Z) it.next(), i);
            }
            return;
        }
        A03(c47z, i);
    }

    public static final void A05(C47Z c47z, C70353Dt c70353Dt, Throwable th) {
        Exception exc;
        if (c47z.A11() || AbstractC210079Qv.A08(c47z)) {
            C50665MYi c50665MYi = new C50665MYi(c70353Dt.A02);
            try {
                HashMap A00 = AbstractC54091Nvp.A00(c47z, c50665MYi);
                HashMap hashMap = new HashMap();
                hashMap.putAll(A00);
                if (th != null) {
                    exc = new Exception(th);
                } else {
                    exc = new Exception("unknown");
                }
                AbstractC68335VMv.A00(c50665MYi, exc, "media_upload_flow_fatal", hashMap, c50665MYi.now());
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("share type: ");
                sb.append(c47z.A0D());
                C0w9.A05("videolite_event_err_fail", sb.toString(), 1, th2);
            }
        }
    }
}
