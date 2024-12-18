package X;

import android.text.TextUtils;
import com.facebook.advancedcryptotransport.DnsResolverImpl;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128835rx extends AbstractRunnableC94874Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeHolder A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C128835rx(String str, NativeHolder nativeHolder, int i) {
        super("dnsResolverImplResolveIpsAsynchronously");
        this.A02 = str;
        this.A01 = nativeHolder;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C124445k0 c124445k0;
        String str;
        AbstractC09800fd.A01("dnsResolveAsync:dnsResolverImplResolveIpsAsynchronously:run", 282414238);
        String str2 = this.A02;
        DnsResolverImpl dnsResolverImpl = DnsResolverImpl.$redex_init_class;
        if (TextUtils.isEmpty(str2)) {
            c124445k0 = new C124445k0(null, 0);
        } else {
            boolean z = true;
            try {
                C68748VbR c68748VbR = AbstractC128845ry.A00;
                if (c68748VbR != null) {
                    try {
                        C69405Vmp c69405Vmp = c68748VbR.A00;
                        try {
                            try {
                                Object obj = c69405Vmp.A04;
                                synchronized (obj) {
                                    try {
                                        c69405Vmp.A01 = C05F.A0j;
                                    } finally {
                                    }
                                }
                                C214189eI c214189eI = c69405Vmp.A03;
                                List list = (List) c214189eI.A00.A02(str2);
                                if (c69405Vmp.A00 != 0) {
                                    C99N.A00().A00 = c69405Vmp.A02.A00() - c69405Vmp.A00;
                                }
                                ArrayList arrayList = c69405Vmp.A05;
                                synchronized (arrayList) {
                                    try {
                                        if (!arrayList.isEmpty()) {
                                            ArrayList arrayList2 = new ArrayList(arrayList);
                                            arrayList.clear();
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                c214189eI.A00(it.next());
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                synchronized (obj) {
                                    C99O A00 = C99N.A00();
                                    String A002 = AbstractC61790Rtk.A00(c69405Vmp.A01);
                                    synchronized (A00.A03) {
                                        A00.A01 = A002;
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(list.size());
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((InetAddress) it2.next()).getHostAddress());
                                }
                                list.size();
                                c124445k0 = new C124445k0(arrayList3, 1);
                            } catch (Throwable th2) {
                                synchronized (c69405Vmp.A04) {
                                    C99O A003 = C99N.A00();
                                    String A004 = AbstractC61790Rtk.A00(c69405Vmp.A01);
                                    synchronized (A003.A03) {
                                        A003.A01 = A004;
                                        throw th2;
                                    }
                                }
                            }
                        } catch (ExecutionException e) {
                            synchronized (c69405Vmp.A04) {
                                try {
                                    c69405Vmp.A01 = C05F.A00;
                                    Throwable cause = e.getCause();
                                    while (cause != null && (cause instanceof ExecutionException)) {
                                        cause = cause.getCause();
                                    }
                                    if (!(cause instanceof UnknownHostException)) {
                                        if (cause == null) {
                                            str = null;
                                        } else {
                                            str = cause.getMessage();
                                        }
                                        throw new UnknownHostException(str);
                                    }
                                    throw cause;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    allByName.getClass();
                    ArrayList arrayList4 = new ArrayList(allByName.length);
                    for (InetAddress inetAddress : allByName) {
                        arrayList4.add(inetAddress.getHostAddress());
                    }
                    c124445k0 = new C124445k0(arrayList4, 1);
                }
                C99O A005 = C99N.A00();
                List list2 = c124445k0.A01;
                boolean z2 = false;
                if (AbstractC128845ry.A00 != null) {
                    z2 = true;
                }
                A005.A00(null, list2, 1, z2);
            } catch (UnknownHostException e2) {
                C99O A006 = C99N.A00();
                String obj2 = e2.toString();
                if (AbstractC128845ry.A00 == null) {
                    z = false;
                }
                A006.A00(obj2, null, 0, z);
                c124445k0 = new C124445k0(null, 0);
            }
        }
        Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.5k1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("dnsResolverImplCallNativeCompletion");
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC09800fd.A01("dnsResolveAsync:dnsResolverImplCallNativeCompletion:run", -2130266282);
                C124445k0 c124445k02 = c124445k0;
                DnsResolverImpl.dnsResolveAsyncCompletionHandler(c124445k02.A01, c124445k02.A00, C128835rx.this.A01);
                AbstractC09800fd.A00(-1991956619);
            }
        }, null, this.A00);
        AbstractC09800fd.A00(2020131144);
    }
}
