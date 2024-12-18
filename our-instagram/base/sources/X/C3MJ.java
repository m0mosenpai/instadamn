package X;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* renamed from: X.3MJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MJ {
    public boolean A00;
    public final C3MK A01;
    public final C18220v9 A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final CopyOnWriteArraySet A05;
    public final C3MN[] A06;
    public final AtomicInteger A07;

    public C3MJ(Context context, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        C14360o3.A0B(context, 2);
        this.A01 = new C3MK(context, abstractC12990ll);
        this.A06 = C3ML.A00(this);
        this.A07 = new AtomicInteger();
        C13920nI c13920nI = C13920nI.A00;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        C14360o3.A0B(c13920nI, 1);
        this.A02 = new C18220v9(c13920nI, A00);
        this.A03 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A04 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A05 = new CopyOnWriteArraySet();
    }

    public static final void A01(final C3MJ c3mj) {
        File[] listFiles;
        int length;
        if (!c3mj.A05.isEmpty()) {
            String[] strArr = C3MM.A04;
            int i = 0;
            do {
                File file = new File(strArr[i]);
                if (file.canRead() && (listFiles = file.listFiles(new FileFilter() { // from class: X.9I5
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        C14360o3.A0B(file2, 0);
                        if (file2.lastModified() >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L) && !C3MJ.this.A03.contains(file2.getName())) {
                            return true;
                        }
                        return false;
                    }
                })) != null && (length = listFiles.length) != 0) {
                    if (length > 10) {
                        listFiles = C3ML.A01(listFiles, 10);
                    }
                    for (int min = Math.min(10, listFiles.length) - 1; -1 < min; min--) {
                        String path = listFiles[min].getPath();
                        C14360o3.A07(path);
                        A02(c3mj, path);
                    }
                    i++;
                } else {
                    return;
                }
            } while (i < 2);
        }
    }

    public static final void A02(C3MJ c3mj, String str) {
        List A0a;
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = c3mj.A05;
            synchronized (copyOnWriteArraySet) {
                A0a = AbstractC001800i.A0a(copyOnWriteArraySet);
            }
            if (!A0a.isEmpty()) {
                String str2 = str;
                int A05 = AbstractC001900j.A05(str, '/', str.length() - 1);
                if (A05 != -1) {
                    str2 = str.substring(A05 + 1);
                    C14360o3.A07(str2);
                }
                if (!AbstractC002300n.A0h(str2, ".pending", false)) {
                    java.util.Set set = c3mj.A03;
                    if (!set.contains(str2)) {
                        Matcher matcher = C3MM.A03.matcher(str);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            C14360o3.A07(group);
                            int parseInt = Integer.parseInt(group);
                            String group2 = matcher.group(2);
                            C14360o3.A07(group2);
                            int parseInt2 = Integer.parseInt(group2) - 1;
                            String group3 = matcher.group(3);
                            C14360o3.A07(group3);
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4);
                            C14360o3.A07(group4);
                            int parseInt4 = Integer.parseInt(group4);
                            String group5 = matcher.group(5);
                            C14360o3.A07(group5);
                            int parseInt5 = Integer.parseInt(group5);
                            String group6 = matcher.group(6);
                            C14360o3.A07(group6);
                            long timeInMillis = new GregorianCalendar(parseInt, parseInt2, parseInt3, parseInt4, parseInt5, Integer.parseInt(group6)).getTimeInMillis();
                            Long valueOf = Long.valueOf(timeInMillis);
                            if (valueOf != null) {
                                ArrayList<C3MT> arrayList = new ArrayList();
                                Iterator it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((C3MT) next).A00 <= timeInMillis) {
                                        arrayList.add(next);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    for (C3MT c3mt : arrayList) {
                                        set.add(str2);
                                        C11T.A02(new D1W(c3mt, valueOf));
                                    }
                                }
                            }
                        }
                        C3MK c3mk = c3mj.A01;
                        C19280xC A01 = C19280xC.A01("ig_android_screenshot_path_parse_fail", "screenshot_detector");
                        A01.A0C("path", str);
                        A01.A0C("phone_model", Build.MODEL);
                        AbstractC11060iN.A00(c3mk.A01).EHW(A01);
                    }
                }
            }
        } finally {
            c3mj.A04.remove(str);
        }
    }

    public final void A03() {
        int andIncrement = this.A07.getAndIncrement();
        if (andIncrement > 0) {
            new Throwable();
        } else if (andIncrement < 0) {
            C0K8.A0N("NonBlockingScreenshotDetectorImpl", "Negative active watchers: %d previous watchers", new Throwable(), Integer.valueOf(andIncrement));
        } else {
            this.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.3MO
                {
                    super(58, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3MJ c3mj = C3MJ.this;
                    if (!c3mj.A00) {
                        c3mj.A00 = true;
                        String[] strArr = C3MM.A04;
                        int i = 0;
                        boolean z = false;
                        do {
                            if (new File(strArr[i]).canRead()) {
                                c3mj.A06[i].startWatching();
                                z = true;
                            }
                            i++;
                        } while (i < 2);
                        C3MK c3mk = c3mj.A01;
                        boolean A03 = AbstractC93174Ft.A03(c3mk.A00);
                        C19280xC A01 = C19280xC.A01("ig_android_story_screenshot_directory", "screenshot_detector");
                        A01.A09("screenshot_directory_exists", Boolean.valueOf(z));
                        A01.A0C("phone_model", Build.MODEL);
                        A01.A09("has_read_external_storage_permission", Boolean.valueOf(A03));
                        AbstractC11060iN.A00(c3mk.A01).EHW(A01);
                    }
                }
            });
        }
    }

    public final void A04() {
        C18220v9 c18220v9;
        AbstractRunnableC14200nk abstractRunnableC14200nk;
        int decrementAndGet = this.A07.decrementAndGet();
        if (decrementAndGet > 0) {
            if (!this.A05.isEmpty()) {
                c18220v9 = this.A02;
                abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.6xA
                    {
                        super(915558549, 3, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3MJ.A01(C3MJ.this);
                    }
                };
            } else {
                return;
            }
        } else if (decrementAndGet < 0) {
            C0K8.A0K("NonBlockingScreenshotDetectorImpl", "Already stopped ScreenshotDetector", new Throwable());
            return;
        } else {
            c18220v9 = this.A02;
            abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.54E
                {
                    super(59, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3MJ c3mj = C3MJ.this;
                    if (c3mj.A00) {
                        int i = 0;
                        c3mj.A00 = false;
                        String[] strArr = C3MM.A04;
                        do {
                            if (new File(strArr[i]).canRead()) {
                                c3mj.A06[i].stopWatching();
                            }
                            i++;
                        } while (i < 2);
                        C3MJ.A01(c3mj);
                    }
                }
            };
        }
        c18220v9.ATO(abstractRunnableC14200nk);
    }

    public final void A05(C3MT c3mt) {
        if (c3mt != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.A05;
            synchronized (copyOnWriteArraySet) {
                copyOnWriteArraySet.add(c3mt);
                copyOnWriteArraySet.size();
            }
        }
    }

    public final void A06(C3MT c3mt) {
        if (c3mt != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.A05;
            synchronized (copyOnWriteArraySet) {
                copyOnWriteArraySet.remove(c3mt);
                copyOnWriteArraySet.size();
            }
        }
    }

    public static final C3MT A00(C3MR c3mr) {
        return new C3MT(c3mr, System.currentTimeMillis());
    }
}
