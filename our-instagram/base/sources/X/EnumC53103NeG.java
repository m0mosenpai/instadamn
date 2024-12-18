package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A04' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.NeG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53103NeG {
    public static final /* synthetic */ EnumC53103NeG[] A00;
    public static final EnumC53103NeG A01;
    public static final EnumC53103NeG A02;
    public static final EnumC53103NeG A03;
    public static final EnumC53103NeG A04;
    public static final EnumC53103NeG A05;

    static {
        final int i = 0;
        EnumC53103NeG enumC53103NeG = new EnumC53103NeG(i) { // from class: X.UM1
            public final int A00;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    r2.A00 = r3
                    switch(r3) {
                        case 0: goto Lc;
                        case 1: goto L10;
                        case 2: goto L14;
                        case 3: goto L18;
                        default: goto L5;
                    }
                L5:
                    java.lang.String r1 = "TELEPHONE"
                    r0 = 4
                L8:
                    r2.<init>(r1, r0)
                    return
                Lc:
                    java.lang.String r1 = "NAME"
                    r0 = 0
                    goto L8
                L10:
                    java.lang.String r1 = "ADDRESS"
                    r0 = 1
                    goto L8
                L14:
                    java.lang.String r1 = "CITY_STATE_ZIPCODE"
                    r0 = 2
                    goto L8
                L18:
                    java.lang.String r1 = "EMAIL"
                    r0 = 3
                    goto L8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.UM1.<init>(int):void");
            }

            @Override // X.EnumC53103NeG
            public final String A00(Context context, AutofillData autofillData) {
                int i2;
                int i3 = this.A00;
                Resources resources = context.getResources();
                switch (i3) {
                    case 0:
                        i2 = R.string.res_0x7f130084_name_removed;
                        break;
                    case 1:
                    case 2:
                    default:
                        i2 = R.string.res_0x7f130004_name_removed;
                        break;
                    case 3:
                        i2 = R.string.res_0x7f130058_name_removed;
                        break;
                    case 4:
                        i2 = R.string.res_0x7f13012a_name_removed;
                        break;
                }
                return resources.getString(i2);
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // X.EnumC53103NeG
            public final String A01(AutofillData autofillData) {
                Map unmodifiableMap;
                String str;
                switch (this.A00) {
                    case 0:
                        unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                        return (String) unmodifiableMap.get(str);
                    case 1:
                        Map map = autofillData.A00;
                        String str2 = (String) Collections.unmodifiableMap(map).get("address-line1");
                        if (str2 != null) {
                            String str3 = (String) Collections.unmodifiableMap(map).get("address-line2");
                            if (str3 == null) {
                                return str2;
                            }
                            return AnonymousClass001.A0g(str2, " ", str3);
                        }
                        return null;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        Map map2 = autofillData.A00;
                        AbstractC65702TsY.A1T("address-level2", arrayList, Collections.unmodifiableMap(map2));
                        ArrayList arrayList2 = new ArrayList();
                        AbstractC65702TsY.A1T("address-level1", arrayList2, Collections.unmodifiableMap(map2));
                        AbstractC65702TsY.A1T("postal-code", arrayList2, Collections.unmodifiableMap(map2));
                        if (!arrayList2.isEmpty()) {
                            arrayList.add(TextUtils.join(" ", arrayList2));
                        }
                        if (!arrayList.isEmpty()) {
                            return TextUtils.join(", ", arrayList);
                        }
                        return null;
                    case 3:
                        unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                        str = "email";
                        return (String) unmodifiableMap.get(str);
                    default:
                        unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                        str = "tel";
                        return (String) unmodifiableMap.get(str);
                }
            }
        };
        A04 = enumC53103NeG;
        final int i2 = 1;
        EnumC53103NeG um1 = new EnumC53103NeG
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR (r4v0 'um1' X.NeG) = (r0v1 'i2' int A[DONT_INLINE]) A[DECLARE_VAR, MD:(int):void (m)] (LINE:11) call: X.UM1.<init>(int):void type: CONSTRUCTOR in method: X.NeG.<clinit>():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            r0 = 0
            X.UM1 r5 = new X.UM1
            r5.<init>(r0)
            X.EnumC53103NeG.A04 = r5
            r0 = 1
            X.UM1 r4 = new X.UM1
            r4.<init>(r0)
            X.EnumC53103NeG.A01 = r4
            r0 = 2
            X.UM1 r3 = new X.UM1
            r3.<init>(r0)
            X.EnumC53103NeG.A02 = r3
            r0 = 3
            X.UM1 r2 = new X.UM1
            r2.<init>(r0)
            X.EnumC53103NeG.A03 = r2
            r1 = 4
            X.UM1 r0 = new X.UM1
            r0.<init>(r1)
            X.EnumC53103NeG.A05 = r0
            X.NeG[] r0 = new X.EnumC53103NeG[]{r5, r4, r3, r2, r0}
            X.EnumC53103NeG.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC53103NeG.<clinit>():void");
    }

    public abstract String A00(Context context, AutofillData autofillData);

    public abstract String A01(AutofillData autofillData);

    public static EnumC53103NeG[] values() {
        return (EnumC53103NeG[]) A00.clone();
    }

    public EnumC53103NeG(String str, int i) {
    }
}
