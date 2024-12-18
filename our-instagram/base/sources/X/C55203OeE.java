package X;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReportUploadFailedNotificationDismissedReceiver;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OeE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55203OeE {
    public static final C55203OeE A00 = new Object();
    public static final C19L A01 = AnonymousClass194.A02(AbstractC43592JPx.A0W(C12L.A00, 1291882252).plus(new AnonymousClass197(null)));

    public static final void A02(PendingIntent pendingIntent, Context context, Intent intent, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, int i, int i2, boolean z) {
        EnumC47122Ee A02 = C92I.A02(context, abstractC12990ll, "support_ticket");
        C04750Mt c04750Mt = new C04750Mt();
        if (z) {
            c04750Mt.A0D = true;
        } else {
            c04750Mt.A0B(intent, context.getClassLoader());
        }
        PendingIntent A012 = c04750Mt.A01(context, (int) System.currentTimeMillis(), 268435456);
        XN9 xn9 = new XN9(context, A02.A00);
        xn9.A0C(str);
        xn9.A0B(str2);
        xn9.A04(i);
        xn9.A0E(true);
        xn9.A0D(str3);
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = xn9.A0A;
        notification.when = currentTimeMillis;
        xn9.A0i = true;
        xn9.A0C = A012;
        if (pendingIntent != null) {
            notification.deleteIntent = pendingIntent;
        }
        new C23821Ep(context).A00(null, i2, xn9.A03());
    }

    public static final void A03(Context context, BugReportComposerViewModel bugReportComposerViewModel, BugReport bugReport, AbstractC12990ll abstractC12990ll, boolean z) {
        Intent A08 = MSW.A08(context, BugReporterActivity.class);
        A08.putExtra("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
        A08.setFlags(268435456);
        OWK owk = OWK.A00;
        owk.A01(A08, bugReport, abstractC12990ll);
        A08.putExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL", bugReportComposerViewModel);
        A08.putExtra("BugReporterActivity.INTENT_UPLOAD_FAILED", true);
        String A0K = AbstractC53242c7.A0K(context);
        C14360o3.A07(A0K);
        Intent A082 = MSW.A08(context, BugReportUploadFailedNotificationDismissedReceiver.class);
        A082.putExtra("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
        owk.A01(A082, bugReport, abstractC12990ll);
        PendingIntent A02 = MSZ.A0R(context, A082).A02(context, 0, 0);
        String A0t = AbstractC31174DnI.A0t(context, A0K, bugReport.A0A, 2131954353);
        C14360o3.A07(A0t);
        int i = 2131954351;
        if (z) {
            i = 2131954350;
        }
        String A0u = AbstractC25227BEk.A0u(context, i);
        String A0b = AbstractC31177DnL.A0b(context, A0K, 2131954352);
        if (!z) {
            A08 = AbstractC31171DnF.A04();
        }
        A02(A02, context, A08, abstractC12990ll, A0t, A0u, A0b, R.drawable.stat_sys_warning, 2, !z);
    }

    public final void A05(Context context, BugReportComposerViewModel bugReportComposerViewModel, InterfaceC58266PsA interfaceC58266PsA, BugReport bugReport, AbstractC12990ll abstractC12990ll) {
        Collection A1F;
        Object A1D;
        NetworkInfo networkInfo;
        String str;
        String str2;
        String A002;
        BugReport bugReport2 = bugReport;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(bugReport2, bugReportComposerViewModel);
        C14360o3.A0B(interfaceC58266PsA, 3);
        C14360o3.A0B(abstractC12990ll, 4);
        OIN oin = new OIN(bugReport2.A0G);
        interfaceC58266PsA.AW7();
        if (!C18U.A06(C06090Tz.A05, abstractC12990ll, 36327795462323057L)) {
            OWg oWg = new OWg();
            oWg.A02(bugReport2);
            oWg.A0J = AbstractC166987dD.A1F(AbstractC166987dD.A1F(AbstractC001800i.A0S(bugReport2.A0J, bugReport2.A0M)));
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            oWg.A0M = c16930sl;
            bugReport2 = oWg.A01();
        }
        List list = bugReport2.A0L;
        if (list.isEmpty()) {
            A1F = bugReport2.A0K;
        } else {
            A1F = AbstractC06950Ym.A1F(list);
        }
        ArrayList A0S = AbstractC001800i.A0S(bugReport2.A0J, A1F);
        List list2 = bugReport2.A0M;
        C09530e4 A012 = A01(null, A0S);
        C09530e4 A013 = A01(Integer.valueOf(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE), list2);
        Collection collection = (Collection) A012.A00;
        List list3 = (List) A013.A00;
        Object obj = A012.A01;
        List list4 = (List) A013.A01;
        AbstractC167007dF.A1D(collection, 1, list3);
        C14360o3.A0B(obj, 3);
        ArrayList A12 = AbstractC166997dE.A12(list4, 4);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list4) {
            if (((C09530e4) obj2).A01 == EnumC53166NfN.A05) {
                A12.add(obj2);
            } else {
                A1E.add(obj2);
            }
        }
        C09530e4 A1L = AbstractC166987dD.A1L(A12, A1E);
        Iterable iterable = (Iterable) A1L.A00;
        Object obj3 = A1L.A01;
        ArrayList A0S2 = AbstractC001800i.A0S(iterable, collection);
        AbstractC167007dF.A1G(obj3, 4, iterable);
        ArrayList A0S3 = AbstractC001800i.A0S(list3, A0S2);
        ArrayList A0q = AbstractC167017dG.A0q(list3);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC166987dD.A11(((BugReportAttachment) AbstractC43592JPx.A17(it).A00).A03));
        }
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            A0q2.put(((File) it2.next()).getName(), 1);
        }
        try {
            A1D = A0q2.toString();
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        if (C09550e6.A00(A1D) != null) {
            A1D = "{}";
        }
        C14360o3.A09(A1D);
        QuickPerformanceLogger quickPerformanceLogger = oin.A01;
        int i = oin.A00;
        quickPerformanceLogger.markerStart(396363964, i);
        quickPerformanceLogger.markerAnnotate(396363964, i, "endpoint", "graphql");
        quickPerformanceLogger.markerAnnotate(396363964, i, "client_server_join_key", oin.A02);
        quickPerformanceLogger.markerAnnotate(396363964, i, "sync_attachments", (String) A1D);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        Be9 be9 = new Be9();
        String str3 = bugReport2.A0A;
        String str4 = bugReport2.A07;
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        be9.A07(AbstractC16490ru.A0p(AnonymousClass001.A11("\n            ", str3, "\n            ", str4, "\n            ")), DevServerEntity.COLUMN_DESCRIPTION);
        String str5 = bugReport2.A08;
        if (str5 == null) {
            str5 = "493186350727442";
        }
        be9.A07(str5, "category_id");
        be9.A07(bugReport2.A00.toString(), CacheBehaviorLogger.SOURCE);
        be9.A07(C24431Hm.A00(abstractC12990ll).A02, "claim");
        be9.A07(bugReport2.A0H, "endpoint");
        be9.A07(bugReport2.A0B, "nav_chain");
        be9.A07(String.valueOf(AbstractC12880la.A00()), "build_num");
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
        } else {
            str = null;
        }
        be9.A07(str, TraceFieldType.NetworkType);
        if (networkInfo != null) {
            str2 = networkInfo.getSubtypeName();
        } else {
            str2 = null;
        }
        be9.A07(str2, "network_subtype");
        be9.A07(A00("misc_info", new C57273Pbv(0, bugReport2, abstractC12990ll, A0S3, obj, iterable, context, bugReportComposerViewModel, obj3)), "misc_info");
        be9.A07(A00("attachment_file_names", new C50163MDq(A0S3, 24)), "attachment_file_names");
        C0CA.A00(be9.A02(), Boolean.valueOf(bugReportComposerViewModel.A03), "has_complete_logs_consent");
        be9.A05("files", null);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj4 : list3) {
            if (((C09530e4) obj4).A01 == EnumC53166NfN.A06) {
                A1E2.add(obj4);
            }
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it3 = A1E2.iterator();
        while (it3.hasNext()) {
            File A11 = AbstractC166987dD.A11(((BugReportAttachment) AbstractC43592JPx.A17(it3).A00).A03);
            if (A11.exists()) {
                try {
                } catch (IOException e) {
                    C0K8.A0F("BugReporterUploader", "Unable to detect gzip compression for sync attachment file", e);
                }
                if (AbstractC54302NzM.A00(A11)) {
                    A002 = "application/gzip";
                    C2JO c2jo = new C2JO();
                    c2jo.A09(A11.getName(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    c2jo.A09(A002, "mimetype");
                    c2jo.A09(Base64.encodeToString(AbstractC57194Pae.A09(A11), 0), "data");
                    A1E3.add(c2jo);
                }
                A002 = AbstractC13570mj.A00(A11.getPath());
                C2JO c2jo2 = new C2JO();
                c2jo2.A09(A11.getName(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                c2jo2.A09(A002, "mimetype");
                c2jo2.A09(Base64.encodeToString(AbstractC57194Pae.A09(A11), 0), "data");
                A1E3.add(c2jo2);
            }
        }
        be9.A05("sync_inline_attachments", A1E3);
        C2JM A0b = AbstractC25225BEi.A0b();
        A0b.A00(be9, "input");
        C1ON A0H = AbstractC31178DnM.A0H(new C907442n(A0b, C51570Mpu.class, "IGBugReportSubmitMutation", true), abstractC12990ll);
        A0H.A00 = new HGH(0, context, bugReportComposerViewModel, oin, bugReport2, abstractC12990ll, A0S2);
        C1GJ.A02(A0H);
    }

    public static final String A00(String str, InterfaceC16820sZ interfaceC16820sZ) {
        try {
            return interfaceC16820sZ.invoke().toString();
        } catch (JSONException e) {
            String A0S = AnonymousClass001.A0S("Error constructing JSON for Flytrap bug report field '", str, '\'');
            C14360o3.A0B(A0S, 1);
            AbstractC167007dF.A15(C18950wb.A01.AEp("BugReporterUploader", 817892340), DialogModule.KEY_MESSAGE, A0S, e);
            return "";
        }
    }

    public static final C09530e4 A01(Integer num, Iterable iterable) {
        EnumC53166NfN enumC53166NfN;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(iterable));
        for (Object obj : iterable) {
            File A11 = AbstractC166987dD.A11(((BugReportAttachment) obj).A03);
            if (!A11.exists()) {
                C0K8.A0D("BugReportAttachmentValidity", AnonymousClass001.A0R("Discarding non-existent bug report attachment file ", A11.getName()));
                enumC53166NfN = EnumC53166NfN.A03;
            } else if (A11.length() == 0) {
                C0K8.A0D("BugReportAttachmentValidity", AnonymousClass001.A0R("Discarding zero-length bug report attachment file: ", A11.getName()));
                enumC53166NfN = EnumC53166NfN.A02;
            } else if (num != null && A11.length() > num.intValue()) {
                C0K8.A0D("BugReportAttachmentValidity", AnonymousClass001.A0R("Discarding oversized bug report attachment file: ", A11.getName()));
                enumC53166NfN = EnumC53166NfN.A05;
            } else {
                enumC53166NfN = EnumC53166NfN.A06;
            }
            A18.put(obj, enumC53166NfN);
        }
        List A002 = C01S.A00(A18);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : A002) {
            if (((C09530e4) obj2).A01 == EnumC53166NfN.A06) {
                A1E.add(obj2);
            } else {
                A1E2.add(obj2);
            }
        }
        return AbstractC166987dD.A1L(A1E, A1E2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(android.content.Context r41, X.OIM r42, com.instagram.bugreporter.model.BugReport r43, X.AbstractC12990ll r44, java.io.File r45, java.util.concurrent.CountDownLatch r46, int r47, long r48) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55203OeE.A04(android.content.Context, X.OIM, com.instagram.bugreporter.model.BugReport, X.0ll, java.io.File, java.util.concurrent.CountDownLatch, int, long):void");
    }
}
