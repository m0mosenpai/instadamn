package X;

import android.os.Build;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.irpgo.IRPGO;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.0rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16180rI {
    public static final void A00(UserSession userSession) {
        C11T.A05("This operation can't be run on UI thread.");
        long[] executedFunctionIds = IRPGO.INSTANCE.getExecutedFunctionIds();
        String BdA = AbstractC11060iN.A00(userSession).BdA();
        C18040uk A00 = C0r7.A00();
        A00.A02(Build.VERSION.RELEASE);
        A00.A03(C0JA.A00().toString());
        A00.A04(BdA);
        A00.A05(ImmutableList.copyOf((Collection) AbstractC009903n.A0H(executedFunctionIds)));
        C1Dl A002 = A00.A00();
        A002.toString();
        AbstractC40691uc.A01(userSession).ATV(new InterfaceC48212Jk() { // from class: X.0rH
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
            }
        }, new InterfaceC48192Ji() { // from class: X.0rG
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
            }
        }, A002);
    }

    public static final void A01(UserSession userSession, String str, long[] jArr) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (jArr != null && (jArr.length) != 0) {
            long classId = ClassId.getClassId(ClassTracingLogger.class);
            for (long j : jArr) {
                if (classId == j) {
                    C0w9.A04("dead_code_detection", "Found ClassTracingLogger in class list", 1);
                }
            }
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0B("android_dead_code/upload/");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } finally {
                }
            } catch (IOException e) {
                C0K8.A0F("IgDeadCodeUploader", "Exception in writing to stream", e);
                bArr = new byte[0];
            }
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(gZIPOutputStream);
                for (long j2 : jArr) {
                    try {
                        dataOutputStream.writeLong(j2);
                    } finally {
                    }
                }
                dataOutputStream.flush();
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                C14360o3.A07(bArr);
                dataOutputStream.close();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                c25621Ms.A0K("class_ids", bArr);
                c25621Ms.A9s("process_name", str);
                c25621Ms.A9s("device_os_version", Build.VERSION.RELEASE);
                c25621Ms.A9s("app_build_number", String.valueOf(BuildConstants.A01()));
                c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
                ((AbstractC23721Ec) c25621Ms).A05 = C1Ef.OffScreen;
                c25621Ms.A0M("class_ids");
                C1ON A0N = c25621Ms.A0N();
                A0N.toString();
                C1GJ.A02(A0N);
            } finally {
            }
        }
    }

    public static final void A02(UserSession userSession, String str, long[] jArr) {
        if (jArr != null && (jArr.length) != 0) {
            long classId = ClassId.getClassId(ClassTracingLogger.class);
            String BdA = AbstractC11060iN.A00(userSession).BdA();
            for (long j : jArr) {
                if (classId == j) {
                    C0K8.A0C("dead_code_detection", "Found ClassTracingLogger in class list");
                }
            }
            C18070ur A00 = AbstractC16050r0.A00();
            A00.A06(ImmutableList.copyOf((Collection) AbstractC009903n.A0H(jArr)));
            A00.A02(String.valueOf(BuildConstants.A01()));
            A00.A03(Build.VERSION.RELEASE);
            A00.A04(str);
            A00.A05(BdA);
            C1Dl A002 = A00.A00();
            A002.toString();
            AbstractC40691uc.A01(userSession).ATV(new InterfaceC48212Jk() { // from class: X.0rF
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                }
            }, new InterfaceC48192Ji() { // from class: X.0rE
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                }
            }, A002);
        }
    }
}
