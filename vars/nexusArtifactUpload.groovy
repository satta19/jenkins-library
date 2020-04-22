def call(Map stageParams) {
	
  nexusArtifactUploader artifacts: [[artifactId: stageParams.artifactid, 
					classifier: '', 
					file: stageParams.artifactpath, 
					type: stageParams.type]], 
					credentialsId: stageParams.credentialsid, 
					groupId: stageParams.groupid, 
					nexusUrl: stageParams.nexusurl, 
					nexusVersion: stageParams.nexusversion, 
					protocol: stageParams.protocol, 
					repository: stageParams.repository, 
					version: stageParams.version
 }
