package X;

import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20150ym {
    public static SharedPreferences A00;
    public static boolean A01;
    public static final C20150ym A02 = new Object();
    public static final Map A03;
    public static final java.util.Set A04;
    public static final HashMap A05;
    public static final java.util.Set A06;

    public static final void A04(UserSession userSession) {
        Object obj;
        float floatValue;
        SharedPreferences sharedPreferences = A00;
        if (sharedPreferences != null) {
            ((C17210tG) userSession.A01(C17210tG.class, C02610Ak.A00)).A00 = true;
            A01 = true;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            for (AbstractC20080yf abstractC20080yf : A04) {
                String A022 = A02(abstractC20080yf);
                if (abstractC20080yf instanceof C0tH) {
                    if (!A06.contains(abstractC20080yf) && ((Boolean) A05.getOrDefault(abstractC20080yf, true)).booleanValue()) {
                        obj = ((C0tH) abstractC20080yf).A01(userSession);
                    } else {
                        obj = ((C0tH) abstractC20080yf).A00(userSession);
                    }
                } else if (abstractC20080yf instanceof C17240tK) {
                    if (!A06.contains(abstractC20080yf)) {
                        Object orDefault = A05.getOrDefault(abstractC20080yf, false);
                        C14360o3.A07(orDefault);
                        if (!((Boolean) orDefault).booleanValue()) {
                            obj = ((C17240tK) abstractC20080yf).A00();
                        }
                    }
                    long j = abstractC20080yf.mobileConfigSpecifier;
                    obj = C1AD.A03(C06090Tz.A06, abstractC20080yf.getDefaultValue(), j);
                } else {
                    obj = C0eB.A00;
                }
                if (obj instanceof Boolean) {
                    edit.putBoolean(A022, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Long) {
                    edit.putLong(A022, ((Number) obj).longValue());
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Number) obj).floatValue();
                    } else if (obj instanceof String) {
                        edit.putString(A022, (String) obj);
                    } else if (obj instanceof Double) {
                        floatValue = (float) ((Number) obj).doubleValue();
                    }
                    edit.putFloat(A022, floatValue);
                }
            }
            edit.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(X.AbstractC20080yf r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.0ym r0 = X.C20150ym.A02
            r0.A05(r7)
            java.lang.String r4 = A02(r7)
            java.util.Map r3 = X.C20150ym.A03
            java.lang.Object r1 = r3.get(r4)
            java.lang.String r6 = "Got incorrect type from prefs for: "
            java.lang.String r5 = "EarlyExperimentsHelper_wrongTypeInPrefs"
            r2 = 0
            if (r1 == 0) goto L37
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L86
            java.lang.String r0 = "Got incorrect type from in-memory cache for: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r4)
            java.lang.String r0 = "EarlyExperimentsHelper_wrongTypeInMemory"
            X.C0w9.A03(r0, r1)
            android.content.SharedPreferences r1 = X.C20150ym.A00
            if (r1 != 0) goto L3c
            r0 = 0
        L2e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3.put(r4, r1)
            if (r1 != 0) goto L86
        L37:
            android.content.SharedPreferences r1 = X.C20150ym.A00
            if (r1 == 0) goto L7f
            goto L5e
        L3c:
            java.lang.Object r0 = r7.getDefaultValue()     // Catch: java.lang.ClassCastException -> L4b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L4b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.ClassCastException -> L4b
            boolean r0 = r1.getBoolean(r4, r0)     // Catch: java.lang.ClassCastException -> L4b
            goto L2e
        L4b:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r6, r4)
            X.C0w9.A06(r5, r0, r1)
            java.lang.Object r0 = r7.getDefaultValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L2e
        L5e:
            java.lang.Object r0 = r7.getDefaultValue()     // Catch: java.lang.ClassCastException -> L6d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L6d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.ClassCastException -> L6d
            boolean r2 = r1.getBoolean(r4, r0)     // Catch: java.lang.ClassCastException -> L6d
            goto L7f
        L6d:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r6, r4)
            X.C0w9.A06(r5, r0, r1)
            java.lang.Object r0 = r7.getDefaultValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L7f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r3.put(r4, r1)
        L86:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20150ym.A07(X.0yf):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ym, java.lang.Object] */
    static {
        HashSet hashSet = new HashSet();
        A04 = hashSet;
        A06 = new HashSet();
        A05 = new HashMap();
        A03 = new ConcurrentHashMap(512);
        C0tH A002 = AbstractC20100yh.A00(2342155493117527173L);
        java.util.Set set = A04;
        set.add(A002);
        set.add(AbstractC20100yh.A00(2342154466620408340L));
        set.add(AbstractC20100yh.A00(36311457406648851L));
        set.add(AbstractC20100yh.A00(2342154466620539413L));
        set.add(AbstractC20100yh.A00(36593958881592868L));
        set.add(AbstractC20100yh.A00(36312483905012870L));
        set.add(AbstractC20100yh.A00(36312483905078407L));
        set.add(AbstractC20100yh.A00(36312483905143944L));
        set.add(AbstractC20100yh.A00(36312483905209481L));
        set.add(AbstractC20100yh.A00(36312483905340555L));
        set.add(AbstractC20100yh.A00(36310761621946638L));
        set.add(AbstractC20100yh.A00(36312483905275018L));
        set.add(AbstractC20100yh.A00(2342153783720542491L));
        set.add(AbstractC20100yh.A00(36592249483690369L));
        set.add(AbstractC20100yh.A00(36592249483624832L));
        set.add(AbstractC20100yh.A00(36310774507045148L));
        set.add(AbstractC20100yh.A00(36316602777473567L));
        set.add(AbstractC20100yh.A00(36311156758938050L));
        set.add(AbstractC20100yh.A00(36313725149382876L));
        set.add(AbstractC20100yh.A00(36311156759003587L));
        set.add(AbstractC20100yh.A00(36311156759069124L));
        set.add(AbstractC20100yh.A00(36325536309458064L));
        set.add(AbstractC20100yh.A00(36610924001368295L));
        set.add(AbstractC20100yh.A00(36610924001499368L));
        set.add(AbstractC20100yh.A00(36313119559059236L));
        set.add(AbstractC20100yh.A00(36313119559124773L));
        set.add(AbstractC20100yh.A00(36313119559517991L));
        set.add(AbstractC20100yh.A00(36313119558993699L));
        set.add(AbstractC20100yh.A00(36594594535966505L));
        set.add(AbstractC20100yh.A00(36594594536032042L));
        set.add(AbstractC20100yh.A00(36594594536163116L));
        set.add(AbstractC20100yh.A00(36594594536097579L));
        set.add(AbstractC20100yh.A00(36313119559190310L));
        set.add(AbstractC20100yh.A00(36321477565359621L));
        set.add(AbstractC20100yh.A00(36322259249408096L));
        set.add(AbstractC20070ye.A00(18298313027814620L));
        set.add(AbstractC20100yh.A00(36312578393113790L));
        set.add(AbstractC20070ye.A00(18859265821245456L));
        set.add(AbstractC20100yh.A00(36604992651531457L));
        set.add(AbstractC20070ye.A00(18597921356257662L));
        set.add(AbstractC20070ye.A00(18316446379623474L));
        set.add(AbstractC20070ye.A00(18316446379689011L));
        set.add(AbstractC20070ye.A00(19160871309869691L));
        set.add(AbstractC20100yh.A00(36323517675613498L));
        set.add(AbstractC20100yh.A00(36882194135843259L));
        set.add(AbstractC20100yh.A00(36317491837080802L));
        set.add(AbstractC20100yh.A00(36317491840750858L));
        set.add(AbstractC20100yh.A00(36310826048291143L));
        set.add(AbstractC20100yh.A00(36592301025198512L));
        set.add(AbstractC20100yh.A00(36592301024543146L));
        set.add(AbstractC20100yh.A00(36310826048946505L));
        set.add(AbstractC20100yh.A00(36310826048684360L));
        set.add(AbstractC20100yh.A00(36592301025460658L));
        set.add(AbstractC20100yh.A00(36592301025067438L));
        set.add(AbstractC20100yh.A00(36310826048094534L));
        set.add(AbstractC20100yh.A00(36592301025132975L));
        set.add(AbstractC20100yh.A00(36592301024870828L));
        set.add(AbstractC20100yh.A00(36592301024936365L));
        set.add(AbstractC20100yh.A00(36316229116891321L));
        set.add(AbstractC20100yh.A00(36879179069456640L));
        set.add(AbstractC20100yh.A00(36316229115515063L));
        set.add(AbstractC20100yh.A00(36316229115383989L));
        set.add(AbstractC20100yh.A00(36316229115449526L));
        set.add(AbstractC20100yh.A00(36316229115646136L));
        set.add(AbstractC20100yh.A00(36316229117153466L));
        set.add(AbstractC20100yh.A00(36316229117219003L));
        set.add(AbstractC20100yh.A00(36316229117284540L));
        set.add(AbstractC20100yh.A00(36597704094256026L));
        set.add(AbstractC20100yh.A00(36597704094321563L));
        set.add(AbstractC20100yh.A00(36597704094387100L));
        set.add(AbstractC20100yh.A00(36316229117743293L));
        set.add(AbstractC20100yh.A00(36324595711684862L));
        set.add(AbstractC20100yh.A00(36324595711815936L));
        set.add(AbstractC20100yh.A00(36324595711881473L));
        set.add(AbstractC20100yh.A00(36324595711750399L));
        set.add(AbstractC20100yh.A00(36324595711619325L));
        set.add(AbstractC20100yh.A00(36323006573783910L));
        set.add(AbstractC20100yh.A00(36323006573849447L));
        C0tH A003 = AbstractC20100yh.A00(36326270748866352L);
        Integer num = C05F.A01;
        A06(A003, num);
        A06(AbstractC20100yh.A00(36326270748931889L), num);
        set.add(AbstractC20100yh.A00(36310881881293155L));
        set.add(AbstractC20100yh.A00(36310881881031007L));
        set.add(AbstractC20100yh.A00(36310881881227618L));
        set.add(AbstractC20100yh.A00(36310881881096544L));
        set.add(AbstractC20070ye.A00(18299373885065462L));
        set.add(AbstractC20070ye.A00(18299373885130999L));
        set.add(AbstractC20070ye.A00(18580848861907050L));
        set.add(AbstractC20100yh.A00(2342153788016361759L));
        set.add(AbstractC20100yh.A00(36310778802602270L));
        set.add(AbstractC20100yh.A00(36310778802733344L));
        set.add(AbstractC20100yh.A00(36310778802143517L));
        set.add(AbstractC20100yh.A00(36310778803585313L));
        set.add(AbstractC20100yh.A00(36310778803650850L));
        set.add(AbstractC20100yh.A00(36310778803716387L));
        set.add(AbstractC20100yh.A00(36310778803912996L));
        set.add(AbstractC20100yh.A00(36878234175930534L));
        set.add(AbstractC20100yh.A00(36592253781213573L));
        set.add(AbstractC20100yh.A00(36310778804633895L));
        set.add(AbstractC20100yh.A00(36593563743552887L));
        set.add(AbstractC20100yh.A00(36593563743618424L));
        set.add(AbstractC20100yh.A00(36310778804896040L));
        set.add(AbstractC20100yh.A00(36315284223233156L));
        set.add(AbstractC20100yh.A00(36878234176323751L));
        set.add(AbstractC20100yh.A00(36878234176848040L));
        set.add(AbstractC20100yh.A00(36315284223036547L));
        set.add(AbstractC20100yh.A00(36315284222971010L));
        set.add(AbstractC20100yh.A00(36596759199877755L));
        set.add(AbstractC20100yh.A00(36596759199812218L));
        set.add(AbstractC20100yh.A00(36315284222839937L));
        set.add(AbstractC20100yh.A00(36592253781672326L));
        set.add(AbstractC20100yh.A00(36310778805092650L));
        set.add(AbstractC20100yh.A00(36596759200074364L));
        set.add(AbstractC20100yh.A00(36326343763310412L));
        set.add(AbstractC20100yh.A00(36310933421228412L));
        set.add(AbstractC20100yh.A00(36310933421359485L));
        set.add(AbstractC20070ye.A00(18297037422789136L));
        set.add(AbstractC20070ye.A00(18578070017409591L));
        set.add(AbstractC20070ye.A00(18296324457758962L));
        set.add(AbstractC20100yh.A00(36311916968149822L));
        set.add(AbstractC20100yh.A00(36593391945057529L));
        set.add(AbstractC20100yh.A00(36311916968215359L));
        set.add(AbstractC20100yh.A00(36311916968280896L));
        set.add(AbstractC20100yh.A00(36874866921832503L));
        set.add(AbstractC20100yh.A00(36311916968477505L));
        set.add(AbstractC20100yh.A00(36593391945254138L));
        A06(AbstractC20100yh.A00(36324316538744932L), num);
        A06(AbstractC20100yh.A00(36324316538810469L), num);
        A06(AbstractC20100yh.A00(36324316538876006L), num);
        set.add(AbstractC20100yh.A00(36323406011182293L));
        set.add(AbstractC20100yh.A00(36313622070167743L));
        set.add(AbstractC20100yh.A00(36313098084157163L));
        set.add(AbstractC20100yh.A00(36313098084288236L));
        set.add(AbstractC20100yh.A00(36594573061261073L));
        set.add(AbstractC20100yh.A00(36313098088154901L));
        set.add(AbstractC20100yh.A00(36313098088351512L));
        set.add(AbstractC20100yh.A00(36314103106636188L));
        set.add(AbstractC20100yh.A00(2342157112320199067L));
        set.add(AbstractC20100yh.A00(2342157112320526751L));
        set.add(AbstractC20100yh.A00(36314103107160481L));
        set.add(AbstractC20100yh.A00(36314103107094944L));
        set.add(AbstractC20100yh.A00(36330299428717352L));
        set.add(AbstractC20100yh.A00(36330299428782889L));
        set.add(AbstractC20100yh.A00(36330299428848426L));
        set.add(AbstractC20100yh.A00(36330299428913963L));
        set.add(AbstractC20100yh.A00(36611774405679443L));
        set.add(AbstractC20100yh.A00(36314103107684773L));
        set.add(AbstractC20100yh.A00(36314103108012455L));
        set.add(AbstractC20100yh.A00(36595578084264121L));
        set.add(AbstractC20100yh.A00(36595578084067511L));
        set.add(AbstractC20100yh.A00(36595578084001974L));
        set.add(AbstractC20100yh.A00(36595578084198584L));
        set.add(AbstractC20100yh.A00(36595578084460730L));
        set.add(AbstractC20100yh.A00(36595578084657340L));
        set.add(AbstractC20100yh.A00(36314103108995506L));
        set.add(AbstractC20100yh.A00(36314103108405674L));
        set.add(AbstractC20100yh.A00(36314103110764994L));
        set.add(AbstractC20100yh.A00(36595578087672001L));
        set.add(AbstractC20100yh.A00(36314103111354823L));
        set.add(AbstractC20100yh.A00(36314103111092676L));
        set.add(AbstractC20100yh.A00(36314103108864432L));
        set.add(AbstractC20100yh.A00(36314103111158213L));
        set.add(AbstractC20100yh.A00(36314103109061043L));
        set.add(AbstractC20100yh.A00(36314103109126580L));
        set.add(AbstractC20100yh.A00(36314103109716409L));
        set.add(AbstractC20100yh.A00(36314103113255383L));
        set.add(AbstractC20100yh.A00(36314103109781946L));
        set.add(AbstractC20100yh.A00(36595578087934147L));
        set.add(AbstractC20100yh.A00(36314103109978555L));
        set.add(AbstractC20100yh.A00(36314103110044092L));
        set.add(AbstractC20100yh.A00(36595578086820030L));
        set.add(AbstractC20100yh.A00(36314103110240702L));
        set.add(AbstractC20100yh.A00(36314103110371776L));
        set.add(AbstractC20100yh.A00(36595578088130756L));
        set.add(AbstractC20100yh.A00(36314103109257654L));
        set.add(AbstractC20100yh.A00(36314103111289286L));
        set.add(AbstractC20100yh.A00(36314103111551432L));
        set.add(AbstractC20100yh.A00(36314103111944651L));
        set.add(AbstractC20100yh.A00(36314103112206798L));
        set.add(AbstractC20100yh.A00(36314103112075724L));
        set.add(AbstractC20100yh.A00(36314103112272335L));
        set.add(AbstractC20100yh.A00(36595578089048261L));
        A06(AbstractC20100yh.A00(36314103112141261L), num);
        set.add(AbstractC20100yh.A00(36314103112468945L));
        set.add(AbstractC20100yh.A00(36314103112534482L));
        set.add(AbstractC20100yh.A00(36314103112927699L));
        set.add(AbstractC20100yh.A00(36595578089703622L));
        set.add(AbstractC20100yh.A00(36314103110896067L));
        set.add(AbstractC20100yh.A00(36314103113058772L));
        set.add(AbstractC20100yh.A00(36314103113124309L));
        set.add(AbstractC20100yh.A00(36314103113189846L));
        set.add(AbstractC20100yh.A00(36314103113320920L));
        set.add(AbstractC20100yh.A00(36314103113451994L));
        set.add(AbstractC20100yh.A00(36314103113386457L));
        set.add(AbstractC20070ye.A00(18300791224339555L));
        set.add(AbstractC20070ye.A00(18863741177233566L));
        set.add(AbstractC20070ye.A00(2324143800438688870L));
        set.add(AbstractC20070ye.A00(2324143800438164580L));
        set.add(AbstractC20070ye.A00(2324143800438754407L));
        set.add(AbstractC20070ye.A00(18300791225257065L));
        set.add(AbstractC20070ye.A00(2324143800438819944L));
        set.add(AbstractC20100yh.A00(36595011147597821L));
        set.add(AbstractC20100yh.A00(36312015752397691L));
        set.add(AbstractC20100yh.A00(36315030819441620L));
        set.add(AbstractC20100yh.A00(36312269155664925L));
        hashSet.add(AbstractC20100yh.A00(36320914924708852L));
        hashSet.add(AbstractC20100yh.A00(36330965148124259L));
        hashSet.add(AbstractC20100yh.A00(36320914925036534L));
        hashSet.add(AbstractC20100yh.A00(36602389901677196L));
        set.add(AbstractC20100yh.A00(36314408049314343L));
        set.add(AbstractC20100yh.A00(36319158283017234L));
        set.add(AbstractC20100yh.A00(36319390211251610L));
        hashSet.add(AbstractC20100yh.A00(36319390211317147L));
        set.add(AbstractC20100yh.A00(36326137604880039L));
        set.add(AbstractC20100yh.A00(36607612581647990L));
        set.add(AbstractC20100yh.A00(36607612581713527L));
        set.add(AbstractC20070ye.A00(18308801337764937L));
        set.add(AbstractC20100yh.A00(36598348337188042L));
        set.add(AbstractC20100yh.A00(36598348337253579L));
        set.add(AbstractC20100yh.A00(36315022229507025L));
        set.add(AbstractC20100yh.A00(36323968646590188L));
        set.add(AbstractC20100yh.A00(36320060226150362L));
        set.add(AbstractC20100yh.A00(36315533330615661L));
        set.add(AbstractC20100yh.A00(36315533330681198L));
        set.add(AbstractC20100yh.A00(36315533330746735L));
        set.add(AbstractC20100yh.A00(2342155664916284623L));
        set.add(AbstractC20100yh.A00(36312655702721744L));
        set.add(AbstractC20100yh.A00(36314158941145574L));
        set.add(AbstractC20100yh.A00(36314158941211111L));
        set.add(AbstractC20070ye.A00(18861898636197981L));
        set.add(AbstractC20070ye.A00(18861898636329054L));
        set.add(AbstractC20070ye.A00(18298948682844062L));
        set.add(AbstractC20070ye.A00(18298948683237280L));
        set.add(AbstractC20070ye.A00(18861898636722274L));
        set.add(AbstractC20100yh.A00(36313076609386214L));
        set.add(AbstractC20100yh.A00(36313480336246814L));
        set.add(AbstractC20100yh.A00(36595024032434184L));
        set.add(AbstractC20100yh.A00(36313549055854686L));
        set.add(AbstractC20100yh.A00(36595024032761865L));
        set.add(AbstractC20100yh.A00(36313570530625700L));
        set.add(AbstractC20100yh.A00(36313570530691237L));
        set.add(AbstractC20100yh.A00(36313570530756774L));
        set.add(AbstractC20100yh.A00(36313600595331244L));
        set.add(AbstractC20100yh.A00(36313600595462318L));
        set.add(AbstractC20100yh.A00(36313613480364210L));
        set.add(AbstractC20100yh.A00(36313613480298673L));
        set.add(AbstractC20100yh.A00(36313613480233136L));
        set.add(AbstractC20100yh.A00(36313613480429747L));
        set.add(AbstractC20070ye.A00(18299219265849529L));
        set.add(AbstractC20070ye.A00(18299219265718456L));
        set.add(AbstractC20070ye.A00(18299219265915066L));
        set.add(AbstractC20100yh.A00(36313823933630729L));
        set.add(AbstractC20100yh.A00(36314038681995650L));
        set.add(AbstractC20100yh.A00(36314073041734033L));
        set.add(AbstractC20100yh.A00(36877022995218559L));
        set.add(AbstractC20100yh.A00(36311118104232373L));
        set.add(AbstractC20070ye.A00(18299219265980603L));
        set.add(AbstractC20100yh.A00(36313613480495284L));
        set.add(AbstractC20100yh.A00(36313613480626358L));
        set.add(AbstractC20070ye.A00(18299219266046140L));
        set.add(AbstractC20070ye.A00(18299219266177213L));
        set.add(AbstractC20100yh.A00(36313613480560821L));
        set.add(AbstractC20100yh.A00(36313613480691895L));
        set.add(AbstractC20070ye.A00(18299219266242750L));
        set.add(AbstractC20100yh.A00(36318050181584745L));
        set.add(AbstractC20100yh.A00(36318050181453672L));
        set.add(AbstractC20100yh.A00(36317650749625796L));
        set.add(AbstractC20100yh.A00(36317650750019014L));
        set.add(AbstractC20100yh.A00(36317650750477770L));
        set.add(AbstractC20100yh.A00(36313798164809987L));
        set.add(AbstractC20100yh.A00(36316156101201939L));
        set.add(AbstractC20100yh.A00(36316156100874254L));
        set.add(AbstractC20100yh.A00(36316156101005328L));
        set.add(AbstractC20100yh.A00(36316156101070865L));
        set.add(AbstractC20100yh.A00(36316156100939791L));
        set.add(AbstractC20100yh.A00(36316156101136402L));
        C0tH A004 = AbstractC20100yh.A00(36316302129762535L);
        Integer num2 = C05F.A0C;
        A06(A004, num2);
        A06(AbstractC20100yh.A00(36315344352251036L), num2);
        A06(AbstractC20100yh.A00(36316555532833286L), num2);
        set.add(AbstractC20100yh.A00(36316357964337439L));
        set.add(AbstractC20100yh.A00(36317358691718238L));
        set.add(AbstractC20100yh.A00(36317358691849312L));
        set.add(AbstractC20100yh.A00(36317358691783775L));
        set.add(AbstractC20100yh.A00(36317358691914849L));
        set.add(AbstractC20100yh.A00(36316658612048480L));
        set.add(AbstractC20100yh.A00(36316409503945074L));
        set.add(AbstractC20100yh.A00(36316409504010611L));
        set.add(AbstractC20100yh.A00(36597884480851006L));
        set.add(AbstractC20100yh.A00(36597884480916543L));
        set.add(AbstractC20100yh.A00(36597884480982080L));
        set.add(AbstractC20100yh.A00(36316409504338292L));
        set.add(AbstractC20100yh.A00(36324926424101471L));
        set.add(AbstractC20100yh.A00(36317504720606501L));
        set.add(AbstractC20100yh.A00(36329466204537179L));
        set.add(AbstractC20100yh.A00(36329466204602716L));
        set.add(AbstractC20100yh.A00(36597884481113153L));
        set.add(AbstractC20100yh.A00(36324028775935825L));
        set.add(AbstractC20100yh.A00(36605503752705312L));
        set.add(AbstractC20100yh.A00(36605503752836386L));
        set.add(AbstractC20100yh.A00(36605503752901923L));
        set.add(AbstractC20100yh.A00(36886978729673463L));
        set.add(AbstractC20100yh.A00(36329887111332411L));
        set.add(AbstractC20100yh.A00(36592262368526727L));
        set.add(AbstractC20070ye.A00(18298308732650714L));
        set.add(AbstractC20070ye.A00(18298308732716251L));
        set.add(AbstractC20070ye.A00(18579783709492875L));
        set.add(AbstractC20070ye.A00(18578031362769395L));
        set.add(AbstractC20070ye.A00(18296341638152448L));
        set.add(AbstractC20070ye.A00(18296341637824763L));
        set.add(AbstractC20070ye.A00(18296341637890300L));
        set.add(AbstractC20070ye.A00(18296341638021374L));
        set.add(AbstractC20070ye.A00(18296341637759226L));
        set.add(AbstractC20070ye.A00(2324139350852108545L));
        set.add(AbstractC20070ye.A00(18296341638480130L));
        set.add(AbstractC20070ye.A00(18296341638545667L));
        set.add(AbstractC20070ye.A00(18296341637955837L));
        set.add(AbstractC20070ye.A00(18577816616305012L));
        set.add(AbstractC20070ye.A00(18577816615321961L));
        set.add(AbstractC20070ye.A00(18577816615387498L));
        set.add(AbstractC20070ye.A00(18577816615453035L));
        set.add(AbstractC20070ye.A00(18577816615518572L));
        set.add(AbstractC20070ye.A00(18577816615584109L));
        set.add(AbstractC20070ye.A00(18296341638938884L));
        set.add(AbstractC20070ye.A00(18296341639004421L));
        set.add(AbstractC20070ye.A00(18577816615780718L));
        set.add(AbstractC20070ye.A00(18577816615846255L));
        set.add(AbstractC20070ye.A00(18296341639201030L));
        set.add(AbstractC20070ye.A00(18296341639266567L));
        set.add(AbstractC20070ye.A00(18577816616042864L));
        set.add(AbstractC20070ye.A00(18577816616108401L));
        set.add(AbstractC20070ye.A00(18577816616173938L));
        set.add(AbstractC20070ye.A00(18577816616239475L));
        set.add(AbstractC20100yh.A00(2342169537661384638L));
        set.add(AbstractC20100yh.A00(2342169537661450175L));
        set.add(AbstractC20100yh.A00(36608003424655018L));
        set.add(AbstractC20100yh.A00(36326528448018368L));
        set.add(AbstractC20100yh.A00(36326528448411586L));
        set.add(AbstractC20100yh.A00(2342169537662171075L));
        set.add(AbstractC20100yh.A00(2342169537662236612L));
        set.add(AbstractC20100yh.A00(36326528448673734L));
        set.add(AbstractC20100yh.A00(36330299428258597L));
        set.add(AbstractC20100yh.A00(36608003425441452L));
        set.add(AbstractC20100yh.A00(36611774405024079L));
        set.add(AbstractC20100yh.A00(36330299428389670L));
        set.add(AbstractC20100yh.A00(36330299428455207L));
        set.add(AbstractC20100yh.A00(36611774405220688L));
        set.add(AbstractC20100yh.A00(36611774405286225L));
        set.add(AbstractC20100yh.A00(36611774405351762L));
        set.add(AbstractC20100yh.A00(36611774405744980L));
        set.add(AbstractC20100yh.A00(36316216230940813L));
        set.add(AbstractC20100yh.A00(36316216232251543L));
        set.add(AbstractC20100yh.A00(36597691209026439L));
        set.add(AbstractC20100yh.A00(36316216232513689L));
        set.add(AbstractC20100yh.A00(36879166186062066L));
        set.add(AbstractC20100yh.A00(36316216232710298L));
        set.add(AbstractC20100yh.A00(36598309682482365L));
        set.add(AbstractC20100yh.A00(36310465269203055L));
        set.add(AbstractC20100yh.A00(36310465269334128L));
        set.add(AbstractC20100yh.A00(36591940246110275L));
        set.add(AbstractC20100yh.A00(36327486225005166L));
        set.add(AbstractC20100yh.A00(36320309334253922L));
        set.add(AbstractC20100yh.A00(36317345806816348L));
        set.add(AbstractC20100yh.A00(36319944262098796L));
        set.add(AbstractC20100yh.A00(36601419238740175L));
        set.add(AbstractC20100yh.A00(36601419238871248L));
        set.add(AbstractC20100yh.A00(36601419238936785L));
        set.add(AbstractC20100yh.A00(36599203035680216L));
        set.add(AbstractC20100yh.A00(36329461909635418L));
        set.add(AbstractC20100yh.A00(36318398073804930L));
        set.add(AbstractC20100yh.A00(36318368009033845L));
        A06(AbstractC20070ye.A00(2324147236411545962L), num);
        A06(AbstractC20070ye.A00(2324147236411414888L), num);
        A06(AbstractC20070ye.A00(18867177151005057L), num);
        A06(AbstractC20070ye.A00(2324147236411480425L), num);
        A06(AbstractC20070ye.A00(18867177151070594L), num);
        A06(AbstractC20070ye.A00(2324147236411611499L), num);
        set.add(AbstractC20100yh.A00(36319111038376899L));
        set.add(AbstractC20100yh.A00(36600586015149998L));
        set.add(AbstractC20100yh.A00(36875034425425983L));
        set.add(AbstractC20100yh.A00(36875034425491520L));
        set.add(AbstractC20100yh.A00(36315370122054826L));
        set.add(AbstractC20100yh.A00(36315370122120363L));
        set.add(AbstractC20100yh.A00(36328057455787081L));
        set.add(AbstractC20100yh.A00(36328057457491041L));
        set.add(AbstractC20100yh.A00(36328057457425504L));
        set.add(AbstractC20100yh.A00(36328057456835672L));
        set.add(AbstractC20100yh.A00(36328057459194999L));
        set.add(AbstractC20100yh.A00(36317212663747529L));
        set.add(AbstractC20100yh.A00(36328057457949797L));
        set.add(AbstractC20100yh.A00(36328057456770135L));
        set.add(AbstractC20100yh.A00(36328057458867315L));
        set.add(AbstractC20100yh.A00(36328839139508037L));
        set.add(AbstractC20100yh.A00(36328839139442500L));
        set.add(AbstractC20100yh.A00(36328839139573574L));
        set.add(AbstractC20100yh.A00(36328839139639111L));
        set.add(AbstractC20100yh.A00(36328057456245840L));
        set.add(AbstractC20100yh.A00(36328057457228893L));
        set.add(AbstractC20100yh.A00(36328057457163356L));
        set.add(AbstractC20100yh.A00(36328057456311377L));
        set.add(AbstractC20100yh.A00(36322456817903869L));
        set.add(AbstractC20100yh.A00(36885406771380844L));
        hashSet.add(AbstractC20100yh.A00(36885406771446381L));
        set.add(AbstractC20100yh.A00(36329208508137642L));
        set.add(AbstractC20100yh.A00(36329208507941031L));
        set.add(AbstractC20100yh.A00(36329208507744420L));
        set.add(AbstractC20100yh.A00(36892158462329794L));
        set.add(AbstractC20100yh.A00(36610683484969142L));
        set.add(AbstractC20100yh.A00(36329208508203179L));
        set.add(AbstractC20100yh.A00(36329208509317296L));
        set.add(AbstractC20100yh.A00(36892158459970496L));
        set.add(AbstractC20100yh.A00(36329208509382833L));
        set.add(AbstractC20100yh.A00(36610683485034679L));
        set.add(AbstractC20100yh.A00(36610683485558974L));
        set.add(AbstractC20100yh.A00(36610683485755583L));
        set.add(AbstractC20100yh.A00(36610683485231290L));
        set.add(AbstractC20100yh.A00(36892158462198721L));
        set.add(AbstractC20100yh.A00(36610683485427901L));
        set.add(AbstractC20100yh.A00(36610683485362364L));
        set.add(AbstractC20100yh.A00(36610683485165753L));
        set.add(AbstractC20100yh.A00(36329208506630293L));
        set.add(AbstractC20100yh.A00(36601621102203183L));
        set.add(AbstractC20100yh.A00(36610683485296827L));
        set.add(AbstractC20100yh.A00(36610683485100216L));
        set.add(AbstractC20100yh.A00(36329208507809957L));
        set.add(AbstractC20100yh.A00(36329208508989612L));
        set.add(AbstractC20100yh.A00(36329208509120685L));
        set.add(AbstractC20100yh.A00(36329208507154588L));
        set.add(AbstractC20100yh.A00(36329208507220125L));
        set.add(AbstractC20100yh.A00(36329208509710517L));
        set.add(AbstractC20100yh.A00(36329208509579444L));
        set.add(AbstractC20100yh.A00(2342172217721045151L));
        set.add(AbstractC20100yh.A00(36329208509251759L));
        set.add(AbstractC20100yh.A00(36328156239772938L));
        set.add(AbstractC20100yh.A00(36328156239838475L));
        set.add(AbstractC20100yh.A00(36331300155704557L));
        set.add(AbstractC20100yh.A00(36331300155770094L));
        set.add(AbstractC20100yh.A00(36325248547107752L));
        set.add(AbstractC20100yh.A00(36325248546780070L));
        set.add(AbstractC20100yh.A00(2342168257760998313L));
        set.add(AbstractC20100yh.A00(36325248547042215L));
        set.add(AbstractC20100yh.A00(36325248547369898L));
        set.add(AbstractC20100yh.A00(36325248547566507L));
        set.add(AbstractC20100yh.A00(36325248548025261L));
        set.add(AbstractC20100yh.A00(36606723524793858L));
        set.add(AbstractC20100yh.A00(36325248547959724L));
        set.add(AbstractC20100yh.A00(36325248548156334L));
        set.add(AbstractC20100yh.A00(36325248548221871L));
        set.add(AbstractC20100yh.A00(36325248548680629L));
        set.add(AbstractC20100yh.A00(36325248548287408L));
        set.add(AbstractC20100yh.A00(36325248548352945L));
        set.add(AbstractC20100yh.A00(36325248548418482L));
        set.add(AbstractC20100yh.A00(36325875611874770L));
        set.add(AbstractC20100yh.A00(36325875611940307L));
        set.add(AbstractC20100yh.A00(36329977305711200L));
        set.add(AbstractC20100yh.A00(36329977305645663L));
        set.add(AbstractC20100yh.A00(36329977305776737L));
        set.add(AbstractC20100yh.A00(36329977305907810L));
        set.add(AbstractC20100yh.A00(36611452282542358L));
        set.add(AbstractC20100yh.A00(2342172183362027581L));
        set.add(AbstractC20100yh.A00(36329174146760753L));
        set.add(AbstractC20100yh.A00(36329174151282777L));
        set.add(AbstractC20100yh.A00(36329174151217240L));
        set.add(AbstractC20100yh.A00(36892124101149613L));
        set.add(AbstractC20100yh.A00(2342172183366615136L));
        set.add(AbstractC20100yh.A00(2342172183362486339L));
        set.add(AbstractC20100yh.A00(36892124104491951L));
        set.add(AbstractC20100yh.A00(36610649128704143L));
        set.add(AbstractC20100yh.A00(36610649128900754L));
        set.add(AbstractC20100yh.A00(36610649128769680L));
        set.add(AbstractC20100yh.A00(36610649128835217L));
        set.add(AbstractC20100yh.A00(36610649128245387L));
        set.add(AbstractC20100yh.A00(36610649129162901L));
        set.add(AbstractC20100yh.A00(36610649128179850L));
        set.add(AbstractC20100yh.A00(36610649129097364L));
        hashSet.add(AbstractC20100yh.A00(36610649128507532L));
        hashSet.add(AbstractC20100yh.A00(36610649128573069L));
        set.add(AbstractC20100yh.A00(36610649128966291L));
        set.add(AbstractC20100yh.A00(36610649128638606L));
        set.add(AbstractC20100yh.A00(36610649130211488L));
        set.add(AbstractC20100yh.A00(36329174147874876L));
        set.add(AbstractC20100yh.A00(36610649124313206L));
        set.add(AbstractC20100yh.A00(36610649129949340L));
        set.add(AbstractC20100yh.A00(36610649129883803L));
        set.add(AbstractC20100yh.A00(36610649124640887L));
        set.add(AbstractC20100yh.A00(36610649124903035L));
        set.add(AbstractC20100yh.A00(36610649124771961L));
        set.add(AbstractC20100yh.A00(36329174147809339L));
        set.add(AbstractC20100yh.A00(36610649129556120L));
        set.add(AbstractC20100yh.A00(36610649129752729L));
        set.add(AbstractC20100yh.A00(36610649130014877L));
        set.add(AbstractC20100yh.A00(36610649130080414L));
        set.add(AbstractC20100yh.A00(36610649124706424L));
        set.add(AbstractC20100yh.A00(36610649124837498L));
        set.add(AbstractC20100yh.A00(36329174147678266L));
        set.add(AbstractC20100yh.A00(36610649130145951L));
        set.add(AbstractC20100yh.A00(36610649129818266L));
        set.add(AbstractC20100yh.A00(36892124105081777L));
        set.add(AbstractC20100yh.A00(36329174151741532L));
        set.add(AbstractC20100yh.A00(36329174151610459L));
        set.add(AbstractC20100yh.A00(36329174149316682L));
        set.add(AbstractC20100yh.A00(36329174147219508L));
        set.add(AbstractC20100yh.A00(36610649123526772L));
        set.add(AbstractC20100yh.A00(36329174147547193L));
        set.add(AbstractC20100yh.A00(2342172183362289729L));
        set.add(AbstractC20100yh.A00(36329174148661314L));
        set.add(AbstractC20100yh.A00(36329174149120071L));
        set.add(AbstractC20100yh.A00(2342172183362551876L));
        set.add(AbstractC20100yh.A00(2342172183362748486L));
        set.add(AbstractC20100yh.A00(36329174149251145L));
        set.add(AbstractC20100yh.A00(36892124102132654L));
        set.add(AbstractC20100yh.A00(36610649125689469L));
        set.add(AbstractC20100yh.A00(2342172183362617413L));
        set.add(AbstractC20100yh.A00(2342172183362879560L));
        set.add(AbstractC20100yh.A00(36329174152724575L));
        set.add(AbstractC20100yh.A00(36892124100428716L));
        set.add(AbstractC20100yh.A00(36892124100297643L));
        set.add(AbstractC20100yh.A00(36892124105737138L));
        set.add(AbstractC20100yh.A00(36329174153904230L));
        set.add(AbstractC20100yh.A00(36329174147285045L));
        set.add(AbstractC20100yh.A00(36329174154035304L));
        set.add(AbstractC20100yh.A00(36329174147416119L));
        set.add(AbstractC20100yh.A00(36610649126082686L));
        set.add(AbstractC20100yh.A00(36329174152593501L));
        set.add(AbstractC20100yh.A00(36892124104754096L));
        set.add(AbstractC20100yh.A00(36610649126541441L));
        set.add(AbstractC20100yh.A00(36329174149644364L));
        set.add(AbstractC20100yh.A00(36329174147350582L));
        set.add(AbstractC20100yh.A00(36610649126475904L));
        set.add(AbstractC20100yh.A00(36610649126803587L));
        set.add(AbstractC20100yh.A00(36610649127262343L));
        set.add(AbstractC20100yh.A00(36329174150496338L));
        set.add(AbstractC20100yh.A00(2342172183363928144L));
        set.add(AbstractC20100yh.A00(2342172183363600462L));
        set.add(AbstractC20100yh.A00(36610649126738050L));
        set.add(AbstractC20100yh.A00(36610649127458953L));
        set.add(AbstractC20100yh.A00(36610649127065734L));
        set.add(AbstractC20100yh.A00(36610649127000197L));
        set.add(AbstractC20100yh.A00(36329174150430801L));
        set.add(AbstractC20100yh.A00(37173599079629408L));
        set.add(AbstractC20100yh.A00(2342172183363403853L));
        set.add(AbstractC20100yh.A00(36610649127327880L));
        set.add(AbstractC20100yh.A00(36610649126869124L));
        set.add(AbstractC20100yh.A00(36329174149578827L));
        set.add(AbstractC20100yh.A00(36329174150824019L));
        set.add(AbstractC20100yh.A00(36329174149972047L));
        set.add(AbstractC20100yh.A00(36329174154166378L));
        set.add(AbstractC20100yh.A00(36329174148464703L));
        set.add(AbstractC20100yh.A00(36329174154428523L));
        set.add(AbstractC20100yh.A00(36329174154494060L));
        set.add(AbstractC20100yh.A00(36892124108030900L));
        set.add(AbstractC20100yh.A00(36610649131456673L));
        set.add(AbstractC20100yh.A00(36329174154952815L));
        set.add(AbstractC20100yh.A00(36329174154821742L));
        set.add(AbstractC20100yh.A00(36329174155018352L));
        A06(AbstractC20100yh.A00(36329174155214961L), num);
        A06(AbstractC20100yh.A00(36610649131849890L), num);
        set.add(AbstractC20100yh.A00(36329174155346034L));
        set.add(AbstractC20100yh.A00(36320249204711637L));
        set.add(AbstractC20100yh.A00(36321451795621323L));
        set.add(AbstractC20100yh.A00(36321451795686860L));
        set.add(AbstractC20100yh.A00(36321451796080080L));
        set.add(AbstractC20100yh.A00(37165876726268311L));
        set.add(AbstractC20100yh.A00(36321451796276690L));
        A06(AbstractC20100yh.A00(36331038162633866L), num2);
        A06(AbstractC20100yh.A00(36331038162699403L), num2);
        A06(AbstractC20100yh.A00(36331209961260244L), num2);
        A06(AbstractC20100yh.A00(2342162017173445450L), num);
        set.add(AbstractC20100yh.A00(36605825875187039L));
        set.add(AbstractC20070ye.A00(2324138917059690505L));
        set.add(AbstractC20070ye.A00(18858857799811072L));
        set.add(AbstractC20070ye.A00(18577382823165964L));
        set.add(AbstractC20070ye.A00(18858857799942145L));
        set.add(AbstractC20070ye.A00(18295907846717450L));
        set.add(AbstractC20070ye.A00(18858857800204290L));
        set.add(AbstractC20070ye.A00(18858857800269827L));
        set.add(AbstractC20100yh.A00(36325175532794707L));
        set.add(AbstractC20100yh.A00(36325175532335948L));
        set.add(AbstractC20100yh.A00(36325175532401485L));
        set.add(AbstractC20100yh.A00(36325175533056855L));
        set.add(AbstractC20100yh.A00(36325175532204874L));
        set.add(AbstractC20100yh.A00(36325175532467022L));
        set.add(AbstractC20100yh.A00(36325175532860244L));
        set.add(AbstractC20100yh.A00(36325175533253464L));
        set.add(AbstractC20100yh.A00(36325368805733407L));
        set.add(AbstractC20100yh.A00(36325373101028386L));
        set.add(AbstractC20100yh.A00(36888323054109485L));
        set.add(AbstractC20100yh.A00(37169798030885375L));
        set.add(AbstractC20100yh.A00(36606848077534735L));
        set.add(AbstractC20100yh.A00(36325373100897312L));
        set.add(AbstractC20100yh.A00(36325373100962849L));
        set.add(AbstractC20100yh.A00(36311856838607651L));
        set.add(AbstractC20100yh.A00(36311856838673188L));
        set.add(AbstractC20100yh.A00(2342172209131241605L));
        set.add(AbstractC20100yh.A00(2342172209131176068L));
        set.add(AbstractC20100yh.A00(2342172209132093577L));
        set.add(AbstractC20100yh.A00(36329199917285506L));
        set.add(AbstractC20100yh.A00(36329199918661772L));
        set.add(AbstractC20100yh.A00(2342172209132290187L));
        set.add(AbstractC20100yh.A00(36892149871215548L));
        set.add(AbstractC20100yh.A00(2342172209130848384L));
        set.add(AbstractC20100yh.A00(36329199917219969L));
        set.add(AbstractC20100yh.A00(36329199918858381L));
        set.add(AbstractC20100yh.A00(36892149871281085L));
        set.add(AbstractC20100yh.A00(36892149870822331L));
        set.add(AbstractC20100yh.A00(36610674894313646L));
        set.add(AbstractC20100yh.A00(36329199918334088L));
        set.add(AbstractC20100yh.A00(36610674893789357L));
        set.add(AbstractC20100yh.A00(36610674895231155L));
        set.add(AbstractC20100yh.A00(36610674894706865L));
        set.add(AbstractC20100yh.A00(2342172209131896967L));
        set.add(AbstractC20100yh.A00(2342172209132159114L));
        set.add(AbstractC20100yh.A00(36610674894969010L));
        set.add(AbstractC20100yh.A00(36610674893330601L));
        set.add(AbstractC20100yh.A00(36610674893265064L));
        set.add(AbstractC20100yh.A00(36610674893396138L));
        set.add(AbstractC20100yh.A00(36892149871477694L));
        set.add(AbstractC20100yh.A00(36892149870429114L));
        set.add(AbstractC20100yh.A00(36892149871543231L));
        set.add(AbstractC20100yh.A00(2342172209131241605L));
        set.add(AbstractC20100yh.A00(36329199917940870L));
        set.add(AbstractC20100yh.A00(36610674895493301L));
        set.add(AbstractC20100yh.A00(2342172209131176068L));
        set.add(AbstractC20100yh.A00(2342172209132093577L));
        set.add(AbstractC20100yh.A00(36329199917285506L));
        set.add(AbstractC20100yh.A00(36329199918661772L));
        set.add(AbstractC20100yh.A00(2342172209132290187L));
        set.add(AbstractC20100yh.A00(2342172209131044995L));
        set.add(AbstractC20100yh.A00(2342172209130651775L));
        set.add(AbstractC20100yh.A00(36610674894444720L));
        set.add(AbstractC20100yh.A00(36610674894379183L));
        set.add(AbstractC20100yh.A00(36610674893592748L));
        set.add(AbstractC20100yh.A00(36610674893527211L));
        set.add(AbstractC20100yh.A00(36312054407168898L));
        set.add(AbstractC20100yh.A00(36314717286828827L));
        set.add(AbstractC20070ye.A00(18302990247007349L));
        A06(AbstractC20100yh.A00(36312324990239787L), num2);
        set.add(AbstractC20100yh.A00(36313385846966186L));
        set.add(AbstractC20100yh.A00(36320601392030402L));
        set.add(AbstractC20100yh.A00(36320601392161476L));
        set.add(AbstractC20100yh.A00(36329187032318073L));
        set.add(AbstractC20100yh.A00(36612461599660426L));
        set.add(AbstractC20100yh.A00(36319690858962518L));
        set.add(AbstractC20100yh.A00(36882640812442057L));
        A06(AbstractC20100yh.A00(36326816210303123L), num);
        A06(AbstractC20100yh.A00(36322276429277287L), num);
        A06(AbstractC20100yh.A00(36322276430129256L), num);
        set.add(AbstractC20100yh.A00(36320738830984040L));
        A06(AbstractC20100yh.A00(36327838412192671L), num);
        set.add(AbstractC20100yh.A00(36327838412782504L));
        set.add(AbstractC20100yh.A00(36327838412716967L));
        set.add(AbstractC20100yh.A00(36327838411996061L));
        set.add(AbstractC20100yh.A00(36327838411930524L));
        set.add(AbstractC20100yh.A00(36327838412389282L));
        set.add(AbstractC20100yh.A00(36327838412454819L));
        set.add(AbstractC20100yh.A00(36327838412585893L));
        set.add(AbstractC20100yh.A00(36327838412520356L));
        set.add(AbstractC20100yh.A00(36321468978767345L));
        set.add(AbstractC20100yh.A00(2342172484008231265L));
        set.add(AbstractC20100yh.A00(36610949771499757L));
        set.add(AbstractC20100yh.A00(36610949771368683L));
        set.add(AbstractC20100yh.A00(2342172484008296802L));
        set.add(AbstractC20100yh.A00(36610949771434220L));
        set.add(AbstractC20100yh.A00(2342172484008558947L));
        set.add(AbstractC20100yh.A00(36329474795061605L));
        set.add(AbstractC20100yh.A00(36610949771696366L));
        set.add(AbstractC20100yh.A00(36610949771827439L));
        set.add(AbstractC20100yh.A00(36329474794930532L));
        set.add(AbstractC20100yh.A00(36329474795258215L));
        set.add(AbstractC20100yh.A00(36329474795323752L));
        set.add(AbstractC20100yh.A00(2342172484009083241L));
        set.add(AbstractC20100yh.A00(36329474795454826L));
        set.add(AbstractC20100yh.A00(36610949772220656L));
        set.add(AbstractC20100yh.A00(36329474795651436L));
        set.add(AbstractC20100yh.A00(36329474795585899L));
        set.add(AbstractC20100yh.A00(36610949772482801L));
        set.add(AbstractC20100yh.A00(36329474795848046L));
        set.add(AbstractC20100yh.A00(36610949772613874L));
        set.add(AbstractC20100yh.A00(2342170796086016876L));
        set.add(AbstractC20100yh.A00(2342170796086082413L));
        set.add(AbstractC20100yh.A00(36326416777754480L));
        set.add(AbstractC20100yh.A00(36327477634742882L));
        set.add(AbstractC20100yh.A00(36327511994415744L));
        set.add(AbstractC20100yh.A00(36323406009609421L));
        set.add(AbstractC20100yh.A00(36323406009871566L));
        set.add(AbstractC20100yh.A00(36604880986707088L));
        set.add(AbstractC20100yh.A00(36604880986969235L));
        set.add(AbstractC20100yh.A00(36604880986117259L));
        set.add(AbstractC20100yh.A00(36323406011641047L));
        set.add(AbstractC20100yh.A00(36323406012558554L));
        set.add(AbstractC20100yh.A00(36323406011903193L));
        set.add(AbstractC20100yh.A00(36314103111682506L));
        A06(AbstractC20100yh.A00(36605091436172498L), num);
        set.add(AbstractC20070ye.A00(18310295986516378L));
        set.add(AbstractC20070ye.A00(18873245939991314L));
        set.add(AbstractC20070ye.A00(18310295986385305L));
        set.add(AbstractC20070ye.A00(18873245939860241L));
        set.add(AbstractC20070ye.A00(18310295986647451L));
        A06(AbstractC20100yh.A00(36325450410112076L), num);
        A06(AbstractC20100yh.A00(36325450410177613L), num);
        set.add(AbstractC20100yh.A00(36320146125561954L));
        set.add(AbstractC20100yh.A00(36330338083423043L));
        set.add(AbstractC20100yh.A00(36330338083619652L));
        set.add(AbstractC20100yh.A00(36330338083357506L));
        set.add(AbstractC20100yh.A00(36611813059860822L));
        set.add(AbstractC20100yh.A00(36893288036697054L));
        set.add(AbstractC20100yh.A00(36322654386399623L));
        set.add(AbstractC20100yh.A00(36318814685633027L));
        set.add(AbstractC20100yh.A00(36600289662406494L));
        set.add(AbstractC20100yh.A00(2342159285573652699L));
        set.add(AbstractC20100yh.A00(36315589165190574L));
        set.add(AbstractC20100yh.A00(36321593529476739L));
        set.add(AbstractC20100yh.A00(36603068506248060L));
        set.add(AbstractC20100yh.A00(36603068506313597L));
        set.add(AbstractC20100yh.A00(36603068506379134L));
        set.add(AbstractC20100yh.A00(36603068506444671L));
        set.add(AbstractC20100yh.A00(36603068506510208L));
        set.add(AbstractC20100yh.A00(36603068506575745L));
        set.add(AbstractC20100yh.A00(36318462498314393L));
        set.add(AbstractC20100yh.A00(36318462498379930L));
        set.add(AbstractC20100yh.A00(36325205597827968L));
        set.add(AbstractC20100yh.A00(36325205597893505L));
        set.add(AbstractC20100yh.A00(2342168214810801019L));
        set.add(AbstractC20100yh.A00(36325205597172604L));
        set.add(AbstractC20100yh.A00(36325205597303677L));
        set.add(AbstractC20100yh.A00(36325205597434750L));
        set.add(AbstractC20100yh.A00(36325205597500287L));
        set.add(AbstractC20100yh.A00(36608347021055711L));
        set.add(AbstractC20100yh.A00(36608347020990174L));
        set.add(AbstractC20100yh.A00(36320829025297329L));
        set.add(AbstractC20100yh.A00(36321181213009081L));
        set.add(AbstractC20100yh.A00(36602656189846238L));
        set.add(AbstractC20100yh.A00(36313063726581475L));
        set.add(AbstractC20100yh.A00(36326060295468647L));
        set.add(AbstractC20100yh.A00(36326060295534184L));
        set.add(AbstractC20070ye.A00(18313280988658461L));
        set.add(AbstractC20070ye.A00(18594755965556592L));
        set.add(AbstractC20070ye.A00(18313280988723998L));
        set.add(AbstractC20100yh.A00(36317212663616455L));
        set.add(AbstractC20100yh.A00(36329938650939981L));
        set.add(AbstractC20100yh.A00(36311375802270211L));
        set.add(AbstractC20100yh.A00(36330488406754181L));
        set.add(AbstractC20100yh.A00(36330913608516681L));
        set.add(AbstractC20100yh.A00(36330913608582218L));
        set.add(AbstractC20100yh.A00(36330299429176109L));
        set.add(AbstractC20100yh.A00(36330299429110572L));
        set.add(AbstractC20100yh.A00(36321249932092671L));
        set.add(AbstractC20100yh.A00(36322980803980071L));
        set.add(AbstractC20100yh.A00(36607629761713789L));
        set.add(AbstractC20100yh.A00(36326154785076917L));
        set.add(AbstractC20070ye.A00(18312267376572444L));
        A06(AbstractC20100yh.A00(36322920674372332L), num);
        set.add(AbstractC20100yh.A00(36325042388218529L));
        set.add(AbstractC20100yh.A00(36310826049012042L));
        set.add(AbstractC20100yh.A00(36313098088744734L));
        set.add(AbstractC20100yh.A00(36594573065520925L));
        set.add(AbstractC20100yh.A00(36594573065586462L));
        set.add(AbstractC20100yh.A00(36326906404026555L));
        set.add(AbstractC20100yh.A00(36326906404092092L));
        set.add(AbstractC20100yh.A00(36591893001469999L));
        set.add(AbstractC20100yh.A00(36591893001535536L));
        set.add(AbstractC20100yh.A00(36873367978311684L));
        set.add(AbstractC20100yh.A00(36310418025021494L));
        set.add(AbstractC20100yh.A00(36310418025087031L));
        set.add(AbstractC20100yh.A00(36314283495524872L));
        set.add(AbstractC20100yh.A00(36325948626318875L));
        set.add(AbstractC20100yh.A00(36330406802375524L));
        set.add(AbstractC20100yh.A00(36325188417762152L));
        set.add(AbstractC20100yh.A00(36311513250988611L));
        set.add(AbstractC20100yh.A00(36328143355067630L));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:1|(4:3|(4:5|6|7|(3:9|10|11)(2:13|11))|16|17)|19|20|(5:22|23|24|16|17)(4:25|24|16|17)) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        X.C0w9.A06("EarlyExperimentsHelper_wrongTypeInPrefs", X.AnonymousClass001.A0R("Got incorrect type from prefs for: ", r5), r1);
        r1 = ((java.lang.Number) r8.getDefaultValue()).doubleValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(X.AbstractC20080yf r8) {
        /*
            X.0ym r0 = X.C20150ym.A02
            r0.A05(r8)
            java.lang.String r5 = A02(r8)
            java.util.Map r4 = X.C20150ym.A03
            java.lang.Object r1 = r4.get(r5)
            java.lang.String r7 = "Got incorrect type from prefs for: "
            java.lang.String r6 = "EarlyExperimentsHelper_wrongTypeInPrefs"
            if (r1 == 0) goto L5f
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L98
            java.lang.String r0 = "Got incorrect type from in-memory cache for: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r5)
            java.lang.String r0 = "EarlyExperimentsHelper_wrongTypeInMemory"
            X.C0w9.A03(r0, r1)
            android.content.SharedPreferences r3 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L43
            if (r3 != 0) goto L33
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L43
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L43
            double r0 = r0.doubleValue()     // Catch: java.lang.ClassCastException -> L43
            goto L55
        L33:
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L43
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L43
            double r0 = r0.doubleValue()     // Catch: java.lang.ClassCastException -> L43
            float r2 = (float) r0     // Catch: java.lang.ClassCastException -> L43
            float r2 = r3.getFloat(r5, r2)     // Catch: java.lang.ClassCastException -> L43
            goto L56
        L43:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r7, r5)
            X.C0w9.A06(r6, r0, r1)
            java.lang.Object r0 = r8.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L55:
            float r2 = (float) r0
        L56:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r4.put(r5, r1)
            if (r1 != 0) goto L98
        L5f:
            android.content.SharedPreferences r3 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L7e
            if (r3 != 0) goto L6e
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L7e
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L7e
            double r1 = r0.doubleValue()     // Catch: java.lang.ClassCastException -> L7e
            goto L90
        L6e:
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L7e
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L7e
            double r1 = r0.doubleValue()     // Catch: java.lang.ClassCastException -> L7e
            float r0 = (float) r1     // Catch: java.lang.ClassCastException -> L7e
            float r0 = r3.getFloat(r5, r0)     // Catch: java.lang.ClassCastException -> L7e
            goto L91
        L7e:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r7, r5)
            X.C0w9.A06(r6, r0, r1)
            java.lang.Object r0 = r8.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            double r1 = r0.doubleValue()
        L90:
            float r0 = (float) r1
        L91:
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r4.put(r5, r1)
        L98:
            java.lang.Number r1 = (java.lang.Number) r1
            float r0 = r1.floatValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20150ym.A00(X.0yf):float");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(4:3|(5:5|6|7|(2:11|12)|9)|18|19)|21|22|(2:25|26)|24|18|19|(1:(1:15))) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        X.C0w9.A06("EarlyExperimentsHelper_wrongTypeInPrefs", X.AnonymousClass001.A0R("Got incorrect type from prefs for: ", r5), r1);
        r2 = ((java.lang.Number) r8.getDefaultValue()).longValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A01(X.AbstractC20080yf r8) {
        /*
            X.0ym r0 = X.C20150ym.A02
            r0.A05(r8)
            java.lang.String r5 = A02(r8)
            java.util.Map r4 = X.C20150ym.A03
            java.lang.Object r1 = r4.get(r5)
            java.lang.String r7 = "Got incorrect type from prefs for: "
            java.lang.String r6 = "EarlyExperimentsHelper_wrongTypeInPrefs"
            if (r1 == 0) goto L59
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L8c
            java.lang.String r0 = "Got incorrect type from in-memory cache for: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r5)
            java.lang.String r0 = "EarlyExperimentsHelper_wrongTypeInMemory"
            X.C0w9.A03(r0, r1)
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L3e
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L3e
            long r0 = r0.longValue()     // Catch: java.lang.ClassCastException -> L3e
            android.content.SharedPreferences r3 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L3e
            if (r3 == 0) goto L50
            long r0 = r3.getLong(r5, r0)     // Catch: java.lang.ClassCastException -> L37 java.lang.ClassCastException -> L3e
            goto L50
        L37:
            int r2 = (int) r0     // Catch: java.lang.ClassCastException -> L3e
            int r0 = r3.getInt(r5, r2)     // Catch: java.lang.ClassCastException -> L3e
            long r0 = (long) r0     // Catch: java.lang.ClassCastException -> L3e
            goto L50
        L3e:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r7, r5)
            X.C0w9.A06(r6, r0, r1)
            java.lang.Object r0 = r8.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L50:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r4.put(r5, r1)
            if (r1 != 0) goto L8c
        L59:
            java.lang.Object r0 = r8.getDefaultValue()     // Catch: java.lang.ClassCastException -> L73
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassCastException -> L73
            long r2 = r0.longValue()     // Catch: java.lang.ClassCastException -> L73
            android.content.SharedPreferences r1 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L73
            if (r1 == 0) goto L85
            long r2 = r1.getLong(r5, r2)     // Catch: java.lang.ClassCastException -> L6c java.lang.ClassCastException -> L73
            goto L85
        L6c:
            int r0 = (int) r2     // Catch: java.lang.ClassCastException -> L73
            int r0 = r1.getInt(r5, r0)     // Catch: java.lang.ClassCastException -> L73
            long r2 = (long) r0     // Catch: java.lang.ClassCastException -> L73
            goto L85
        L73:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r7, r5)
            X.C0w9.A06(r6, r0, r1)
            java.lang.Object r0 = r8.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
        L85:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r4.put(r5, r1)
        L8c:
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20150ym.A01(X.0yf):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r0 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(X.AbstractC20080yf r6) {
        /*
            X.0ym r0 = X.C20150ym.A02
            r0.A05(r6)
            java.lang.String r4 = A02(r6)
            java.util.Map r3 = X.C20150ym.A03
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r5 = "Got incorrect type from prefs for: "
            java.lang.String r2 = "EarlyExperimentsHelper_wrongTypeInPrefs"
            if (r0 == 0) goto L53
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L51
            java.lang.String r0 = "Got incorrect type from in-memory cache for: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r4)
            java.lang.String r0 = "EarlyExperimentsHelper_wrongTypeInMemory"
            X.C0w9.A03(r0, r1)
            android.content.SharedPreferences r1 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L42
            if (r1 != 0) goto L2f
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L42
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L42
            goto L4e
        L2f:
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L42
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L42
            java.lang.String r0 = r1.getString(r4, r0)     // Catch: java.lang.ClassCastException -> L42
            if (r0 != 0) goto L4e
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L42
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L42
            goto L4e
        L42:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r5, r4)
            X.C0w9.A06(r2, r0, r1)
            java.lang.Object r0 = r6.getDefaultValue()
        L4e:
            r3.put(r4, r0)
        L51:
            if (r0 != 0) goto L80
        L53:
            android.content.SharedPreferences r1 = X.C20150ym.A00     // Catch: java.lang.ClassCastException -> L71
            if (r1 != 0) goto L5e
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L71
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L71
            goto L7d
        L5e:
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L71
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L71
            java.lang.String r0 = r1.getString(r4, r0)     // Catch: java.lang.ClassCastException -> L71
            if (r0 != 0) goto L7d
            java.lang.Object r0 = r6.getDefaultValue()     // Catch: java.lang.ClassCastException -> L71
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L71
            goto L7d
        L71:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass001.A0R(r5, r4)
            X.C0w9.A06(r2, r0, r1)
            java.lang.Object r0 = r6.getDefaultValue()
        L7d:
            r3.put(r4, r0)
        L80:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20150ym.A03(X.0yf):java.lang.String");
    }

    private final void A05(AbstractC20080yf abstractC20080yf) {
        if (!A04.contains(abstractC20080yf)) {
            C0w9.A03("early_experiment_not_registered", AnonymousClass001.A0J("Experiment is not registered as a pre init experiment: ", ':', abstractC20080yf.getConfigKey(), C0UM.A00(abstractC20080yf.mobileConfigSpecifier)));
        }
        HashMap hashMap = A05;
        if (hashMap.containsKey(abstractC20080yf)) {
            hashMap.put(abstractC20080yf, true);
            if (A01) {
                C0w9.A03("EarlyExperimentsHelper_exposuresAlreadyLogged", AnonymousClass001.A0J("Already logged exposures before ", ':', abstractC20080yf.getConfigKey(), C0UM.A00(abstractC20080yf.mobileConfigSpecifier)));
            }
        }
    }

    public static final void A06(AbstractC20080yf abstractC20080yf, Integer num) {
        A04.add(abstractC20080yf);
        if (num == C05F.A01) {
            A05.put(abstractC20080yf, false);
        } else {
            if (num != C05F.A0C) {
                return;
            }
            A06.add(abstractC20080yf);
        }
    }

    public static final String A02(AbstractC20080yf abstractC20080yf) {
        return AnonymousClass001.A01('_', abstractC20080yf.getConfigKey(), C0UM.A00(abstractC20080yf.mobileConfigSpecifier));
    }
}
