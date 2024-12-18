package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatModelVersionResponse;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150066p2 implements RemoteModelVersionFetcher {
    public final InterfaceC150016ox A00;
    public final C150026oy A01;
    public final InterfaceC40711ue A02;

    public C150066p2(InterfaceC150016ox interfaceC150016ox, C150026oy c150026oy, InterfaceC40711ue interfaceC40711ue) {
        C14360o3.A0B(interfaceC40711ue, 1);
        this.A02 = interfaceC40711ue;
        this.A00 = interfaceC150016ox;
        this.A01 = c150026oy;
    }

    @Override // com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher
    public final void fetchServerPreferredVersions(final List list, final XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(xplatRemoteModelVersionFetchCompletionCallback, 1);
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String serverValue = ((VersionedCapability) it.next()).toServerValue();
            C14360o3.A07(serverValue);
            arrayList.add(serverValue);
        }
        try {
            AnonymousClass897 anonymousClass897 = (AnonymousClass897) AnonymousClass896.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            anonymousClass897.A00.A05("models", copyOf);
            boolean z = false;
            if (copyOf != null) {
                z = true;
            }
            anonymousClass897.A02 = z;
            C1Dk A00 = anonymousClass897.A00();
            this.A02.ATV(new InterfaceC48212Jk() { // from class: X.89A
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback2 = XplatRemoteModelVersionFetchCompletionCallback.this;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Failed to receive model version from nmlml";
                    }
                    xplatRemoteModelVersionFetchCompletionCallback2.onFailure(message);
                }
            }, new InterfaceC48192Ji(this) { // from class: X.899
                public final /* synthetic */ C150066p2 A00;

                {
                    this.A00 = this;
                }

                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    EnumC150056p1 enumC150056p1;
                    C14360o3.A0A(anonymousClass436);
                    Object Bos = anonymousClass436.Bos();
                    if (Bos == null) {
                        String A002 = AbstractC58317Pt9.A00(792);
                        C0K8.A0E("NMLMLRemoteModelVersionFetcher", A002);
                        xplatRemoteModelVersionFetchCompletionCallback.onFailure(A002);
                        return;
                    }
                    C2JS c2js = (C2JS) Bos;
                    if (c2js.getOptionalTreeField(0, "aim_model_version_manifest(models:$models)", C189398aG.class, 682083891) == null) {
                        C0K8.A0E("NMLMLRemoteModelVersionFetcher", "Received Null model versions");
                        return;
                    }
                    C14360o3.A0A(Bos);
                    C2JS optionalTreeField = c2js.getOptionalTreeField(0, "aim_model_version_manifest(models:$models)", C189398aG.class, 682083891);
                    C14360o3.A0A(optionalTreeField);
                    ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "models", C189408aH.class, -262964002);
                    C14360o3.A07(requiredCompactedTreeListField);
                    if (requiredCompactedTreeListField.size() != list.size()) {
                        C0K8.A0Q("NMLMLRemoteModelVersionFetcher", "# of models requested and received are different. requested %d . received %d", Integer.valueOf(arrayList.size()), Integer.valueOf(requiredCompactedTreeListField.size()));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    C1LC it2 = requiredCompactedTreeListField.iterator();
                    C14360o3.A07(it2);
                    while (it2.hasNext()) {
                        C2JS c2js2 = (C2JS) it2.next();
                        if (c2js2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME) != null) {
                            String optionalStringField = c2js2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            C14360o3.A0A(optionalStringField);
                            VersionedCapability fromServerValue = VersionedCapability.fromServerValue(optionalStringField);
                            if (fromServerValue != null) {
                                arrayList2.add(fromServerValue);
                                arrayList4.add(Integer.valueOf(c2js2.getCoercedIntField(1, "version")));
                                C150066p2 c150066p2 = this.A00;
                                arrayList3.add(Boolean.valueOf(c150066p2.A00.AHC(fromServerValue, c2js2.getOptionalStringField(2, "force_download_group_identifier"))));
                                C150026oy c150026oy = c150066p2.A01;
                                if (c2js2.getCoercedBooleanField(3, "is_ard_version")) {
                                    enumC150056p1 = EnumC150056p1.ARD;
                                } else {
                                    enumC150056p1 = EnumC150056p1.NMLML;
                                }
                                InterfaceC19610xo ARD = c150026oy.A00.ARD();
                                ARD.E7K(fromServerValue.toServerValue(), enumC150056p1.toString());
                                c150026oy.A01.put(fromServerValue, enumC150056p1);
                                ARD.apply();
                            }
                        }
                        C0K8.A0Q("NMLMLRemoteModelVersionFetcher", AbstractC58317Pt9.A00(594), c2js2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                    }
                    xplatRemoteModelVersionFetchCompletionCallback.onSuccess(new XplatModelVersionResponse(arrayList3, arrayList2, arrayList4));
                }
            }, A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
