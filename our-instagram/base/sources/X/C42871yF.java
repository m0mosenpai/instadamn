package X;

import android.net.LocalSocket;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42871yF {
    public static C42871yF A09;
    public int A01;
    public volatile boolean A07;
    public volatile long A08;
    public final Map A05 = new HashMap();
    public final Object A03 = new Object();
    public final List A04 = new LinkedList();
    public final Object A02 = new Object();
    public int A00 = -1;
    public volatile String A06 = UUID.randomUUID().toString();

    public static void A01(LocalSocket localSocket, String str) {
        AbstractC459729h.A01("LocalSocketVideoProxy", "Disconnecting url: %s local socket %s", str, localSocket);
        try {
            localSocket.close();
        } catch (IOException e) {
            android.util.Log.e("LocalSocketVideoProxy", String.format("Error trying to close server connection", new Object[0]), e);
        }
    }

    public final synchronized void A05(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z || elapsedRealtime - this.A08 >= 3000) {
            new Thread(new RunnableC49929M2w(this, this.A06), "LocalSocketVideoProxy_reset").start();
            this.A08 = elapsedRealtime;
            this.A07 = false;
            this.A06 = UUID.randomUUID().toString();
        }
    }

    public static C42871yF A00() {
        if (A09 == null) {
            synchronized (C42871yF.class) {
                if (A09 == null) {
                    A09 = new C42871yF();
                }
            }
        }
        return A09;
    }

    public final String A04() {
        return this.A06;
    }

    public static void A02(BufferedReader bufferedReader, Map map) {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                int indexOf = readLine.indexOf(58);
                if (indexOf >= 0) {
                    map.put(readLine.substring(0, indexOf).trim(), readLine.substring(indexOf + 1).trim());
                }
            } else {
                return;
            }
        }
    }

    public static void A03(IOException iOException) {
        if (!"Broken pipe".equals(iOException.getMessage())) {
            android.util.Log.e("LocalSocketVideoProxy", String.format("%s", iOException.getMessage()), iOException);
        }
    }
}
