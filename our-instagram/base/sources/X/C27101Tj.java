package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27101Tj extends AbstractC215613i {
    public static C27101Tj A02;
    public final C27141Tn A00;
    public final C1R9 A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    @Override // X.InterfaceC215713j
    public final String AV4(String str, int[] iArr) {
        ArrayList arrayList;
        C1R9 c1r9 = this.A01;
        AtomicReference atomicReference = c1r9.A07;
        if (atomicReference.get() != null) {
            arrayList = (List) atomicReference.get();
        } else {
            if (!c1r9.A0D) {
                C0w9.A03("string_resources_delegate", StringFormatUtil.formatStrLocaleSafe("StringResourcesDelegate used before initialized: resource %s requested", AnonymousClass001.A0R("fbt hash ", str)));
            }
            ArrayList arrayList2 = new ArrayList(1);
            if (c1r9.A0E) {
                Object obj = c1r9.A08.get();
                if (obj != null) {
                    arrayList2.add(obj);
                }
                if (arrayList2.isEmpty()) {
                    c1r9.A05.A00();
                }
            }
            arrayList = arrayList2;
            if (c1r9.A0D) {
                arrayList = arrayList2;
                if (c1r9.A0E) {
                    arrayList = arrayList2;
                    if (c1r9.A05()) {
                        atomicReference.set(arrayList2);
                        arrayList = arrayList2;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A022 = ((C1U8) it.next()).A02(str, iArr, 0);
            if (A022 != null) {
                return A022;
            }
        }
        C1R8 c1r8 = c1r9.A04;
        C14360o3.A0B(iArr, 2);
        AbstractRunnableC56822jF.A00(c1r8, str, "unknown", iArr);
        return null;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        boolean z;
        Boolean bool;
        C27351Un c27351Un = (C27351Un) C27351Un.A05.getValue();
        int i3 = c27351Un.A00;
        if (i3 != 0 && c27351Un.A04.nextInt(i3) == 0) {
            C18920wW c18920wW = c27351Un.A03;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_assets_usage");
            A00.AAP("asset_name", getResourceEntryName(i));
            InterfaceC08830cm interfaceC08830cm = c27351Un.A01;
            if (interfaceC08830cm != null && (bool = (Boolean) interfaceC08830cm.get()) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            A00.A7v("connected_to_network", Boolean.valueOf(z));
            A00.A7v("cold_start_complete", Boolean.valueOf(c27351Un.A02));
            A00.Cht();
        }
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        XmlResourceParser xmlResourceParser;
        int i2;
        Object obj;
        boolean z;
        if (Systrace.A0E(1L)) {
            C0fO.A01("DownloadedIgResources.getLayout", 1945279225);
        }
        try {
            C27141Tn c27141Tn = this.A00;
            SettableFuture settableFuture = c27141Tn.A07;
            if (settableFuture == null) {
                C0K8.A0E("LayoutUnpacker", "init() was never called before getLayout()");
                c27141Tn.A00();
                settableFuture = c27141Tn.A07;
                if (settableFuture == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (!settableFuture.isDone()) {
                C0K8.A0E("LayoutUnpacker", "mBundledLayoutLoaderFuture did not complete before getLayout() was called");
            }
            try {
                try {
                    AbstractC09800fd.A01("waitForFuture", -758743761);
                    Object obj2 = settableFuture.get();
                    if (obj2 != null) {
                        C27221Tw c27221Tw = (C27221Tw) obj2;
                        AbstractC09800fd.A00(1117908841);
                        if (c27221Tw.A0B) {
                            String string = c27221Tw.A04.getString(i);
                            C14360o3.A07(string);
                            xmlResourceParser = null;
                            if (string.startsWith("L|")) {
                                String A0R = AnonymousClass001.A0R("0x", Integer.toHexString(i));
                                C55912ha c55912ha = new C55912ha(string, A0R);
                                long j = (c55912ha.A01 << 32) | c55912ha.A00;
                                synchronized (((Object[]) c27221Tw.A09.getValue())[Math.abs((((int) (j >> 32)) * 7919) % 50)]) {
                                    try {
                                        obj = c27221Tw.A05.get(Long.valueOf(j));
                                        z = true;
                                        if (obj == null) {
                                            obj = C27221Tw.A00(c55912ha, c27221Tw, A0R, true);
                                            z = false;
                                        }
                                        try {
                                            Object invoke = c27221Tw.A02.invoke(obj, new Object[0]);
                                            C14360o3.A0C(invoke, "null cannot be cast to non-null type android.content.res.XmlResourceParser");
                                            xmlResourceParser = (XmlResourceParser) invoke;
                                        } catch (Exception e) {
                                            if (!(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                                                throw e;
                                            }
                                            throw new RuntimeException(AnonymousClass001.A0R("Could not create XmlResourceParser for bundled layout ", A0R), e);
                                        }
                                    } finally {
                                    }
                                }
                                if (!z) {
                                    C27221Tw.A01(c55912ha, c27221Tw, obj);
                                }
                            }
                        } else {
                            synchronized (c27221Tw) {
                                xmlResourceParser = null;
                                try {
                                    String string2 = c27221Tw.A04.getString(i);
                                    C14360o3.A07(string2);
                                    if (string2.startsWith("L|")) {
                                        String A0R2 = AnonymousClass001.A0R("0x", Integer.toHexString(i));
                                        C55912ha c55912ha2 = new C55912ha(string2, A0R2);
                                        Object obj3 = c27221Tw.A05.get(Long.valueOf((c55912ha2.A01 << 32) | c55912ha2.A00));
                                        if (obj3 == null) {
                                            obj3 = C27221Tw.A00(c55912ha2, c27221Tw, A0R2, false);
                                            C27221Tw.A01(c55912ha2, c27221Tw, obj3);
                                        }
                                        try {
                                            Object invoke2 = c27221Tw.A02.invoke(obj3, new Object[0]);
                                            C14360o3.A0C(invoke2, "null cannot be cast to non-null type android.content.res.XmlResourceParser");
                                            xmlResourceParser = (XmlResourceParser) invoke2;
                                        } catch (Exception e2) {
                                            if (!(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                                                throw e2;
                                            }
                                            throw new RuntimeException(AnonymousClass001.A0R("Could not create XmlResourceParser for bundled layout ", A0R2), e2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (xmlResourceParser == null) {
                            xmlResourceParser = null;
                        }
                        if (xmlResourceParser != null) {
                            if (Systrace.A0E(1L)) {
                                i2 = -1480287501;
                                C0fO.A00(i2);
                            }
                            return xmlResourceParser;
                        }
                        xmlResourceParser = super.getLayout(i);
                        if (Systrace.A0E(1L)) {
                            i2 = -1817730479;
                            C0fO.A00(i2);
                        }
                        return xmlResourceParser;
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (Throwable th2) {
                    AbstractC09800fd.A00(877600817);
                    throw th2;
                }
            } catch (IOException e3) {
                new File(c27141Tn.A00.AXd(null, 2093722256), "layouts.bin.sha256").delete();
                throw new RuntimeException("Corruption detected in layout bundle", e3);
            } catch (InterruptedException e4) {
                throw new RuntimeException("BundledLayoutLoader failed to initialize", e4);
            } catch (ExecutionException e5) {
                throw new RuntimeException("BundledLayoutLoader failed to initialize", e5);
            }
        } catch (Throwable th3) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1226501588);
            }
            throw th3;
        }
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        String A01;
        if (i != 0) {
            int charAt = super.getQuantityText(R.plurals.fake_plural, i2).charAt(0) - '0';
            if (charAt >= 0) {
                Integer[] numArr = AbstractC79813hW.A00;
                if (charAt < 6) {
                    Integer num = numArr[charAt];
                    C1R9 c1r9 = this.A01;
                    if (((-65536) & i) == R.plurals.accounts_selected) {
                        for (C1U8 c1u8 : C1R9.A00(c1r9, i)) {
                            if (c1u8 != null && (A01 = c1u8.A01(num, i, 0, i2)) != null) {
                                return A01;
                            }
                        }
                        try {
                            String quantityString = c1r9.A02.getQuantityString(i, i2);
                            c1r9.A04.A02(i, "arsc", i2);
                            return quantityString;
                        } catch (Resources.NotFoundException e) {
                            c1r9.A04.A02(i, "not_found_error", i2);
                            throw e;
                        }
                    }
                    return c1r9.A02.getQuantityString(i, i2);
                }
            }
            throw new RuntimeException("Requesting a PluralCategory that does not exists");
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        String[] A03;
        if (i != 0) {
            C1R9 c1r9 = this.A01;
            if (((-16777216) & i) == 2130706432) {
                for (C1U8 c1u8 : C1R9.A00(c1r9, i)) {
                    if (c1u8 != null && (A03 = c1u8.A03(i, 0)) != null) {
                        return A03;
                    }
                }
                try {
                    String[] stringArray = c1r9.A02.getStringArray(i);
                    c1r9.A04.A01(i, "arsc");
                    return stringArray;
                } catch (Resources.NotFoundException e) {
                    c1r9.A04.A01(i, "not_found_error");
                    throw e;
                }
            }
            return c1r9.A02.getStringArray(i);
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        if (i != 0) {
            return this.A01.A02(i);
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    public C27101Tj(Context context, C1R9 c1r9, int i, long j, boolean z, boolean z2) {
        super(context.getApplicationContext(), context.getResources());
        C27141Tn c27141Tn;
        this.A01 = c1r9;
        Context applicationContext = context.getApplicationContext();
        Resources resources = context.getResources();
        C27111Tk c27111Tk = (C27111Tk) C27111Tk.A02.getValue();
        synchronized (C27131Tm.class) {
            c27141Tn = C27131Tm.A00;
            if (c27141Tn == null) {
                c27141Tn = new C27141Tn(applicationContext, resources, c27111Tk, j, z, z2);
                C27131Tm.A00 = c27141Tn;
            }
        }
        this.A00 = c27141Tn;
        c27141Tn.A00();
        ((C27351Un) C27351Un.A05.getValue()).A00 = i;
    }

    @Override // X.AbstractC215613i
    public final void A02(Locale locale) {
        super.A02(locale);
        C1R9 c1r9 = this.A01;
        Locale AcO = c1r9.A06.AcO();
        if (c1r9.A0D && !AcO.equals(c1r9.A09.getAndSet(AcO))) {
            C1R9.A01(c1r9);
        }
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return getQuantityText(i, i2).toString();
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return getText(i).toString();
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        return getStringArray(i);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        return String.format(this.A01.A03(), getQuantityText(i, i2).toString(), objArr);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        return String.format(this.A01.A03(), getText(i).toString(), objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        String A022;
        if (i != 0 && (A022 = this.A01.A02(i)) != null) {
            return A022;
        }
        return charSequence;
    }
}
